package com.example;

import com.example.models.Project;
import kalix.javasdk.annotations.Id;
import kalix.javasdk.annotations.TypeId;
import kalix.javasdk.valueentity.ValueEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import java.time.Instant;
import java.util.UUID;

@TypeId("project")
@Id("projectId")
public class ProjectEntity extends ValueEntity<Project> {

    Logger logger = LoggerFactory.getLogger("ProjectEntity");
    private static final UUID emptyProjectId = new UUID(0L, 0L);

    @Override
    public Project emptyState() {
        return Project.builder().projectId(emptyProjectId).build();
    }

    @PostMapping("/projects/{projectId}")
    public Effect<Project> create(@RequestBody Project project) {
        if(currentState().getProjectId().equals(emptyProjectId)) {
            Project updated = Project.builder()
                    .projectId(project.getProjectId())
                    .name(project.getName())
                    .description(project.getDescription())
                    .startDate(project.getStartDate())
                    .endDate(project.getEndDate())
                    .status(project.getStatus())
                    .createdAt(Instant.now())
                    .modifiedAt(Instant.now())
                    .build();
            return effects()
                    .updateState(updated)
                    .thenReply(updated);
        } else {
            return effects().error("Project already exists");
        }
    }

    @GetMapping("/projects/{projectId}")
    public Effect<Project> get() {
        if(currentState().getProjectId() != emptyProjectId) {
            return effects().reply(currentState());
        } else return effects().error("The project does not exist");
    }

    @PutMapping("/projects/{projectId}")
    public Effect<Project> update(@PathVariable String projectId,
                                           @RequestBody Project project) {
        if(currentState().getProjectId() != emptyProjectId) {
            Project updatedProject = currentState()
                    .withDescription(project.getDescription())
                    .withStartDate(project.getStartDate())
                    .withEndDate(project.getEndDate())
                    .withStatus(project.getStatus())
                    .withModifiedAt(Instant.now());

            return effects().updateState(updatedProject)
                    .thenReply(updatedProject);
        } else {
            return effects().error(String.format("Project with id %s does not exist", projectId));
        }
    }


}
