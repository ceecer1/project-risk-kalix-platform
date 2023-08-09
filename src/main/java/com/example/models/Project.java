package com.example.models;

import com.example.enums.ProjectStatusEnum;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.With;
import java.time.Instant;
import java.util.UUID;

@Builder
@Getter
@Setter
public class Project {

    UUID projectId;
    String name;
    @With
    String description;
    @With
    Instant startDate;
    @With
    Instant endDate;
    @With
    ProjectStatusEnum status;
    Instant createdAt;
    @With
    Instant modifiedAt;
}