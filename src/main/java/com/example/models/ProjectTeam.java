package com.example.models;

import com.example.enums.UserRoleEnum;
import com.google.protobuf.util.Timestamps;

/**
 *     teamID: Unique identifier for the project team entry.
 *     projectID: Identifier of the project to which the team belongs.
 *     userID: Identifier of the user who is a member of the project team.
 *     role: The role of the user within the project team (e.g., admin, project manager, team member).
 *     createdAt: The date and time when the project team entry was created.
 *     updatedAt: The date and time when the project team entry was last updated.
 */
public record ProjectTeam(String teamId,
                          String projectId,
                          String userId,
                          UserRoleEnum role,
                          Timestamps createdAt,
                          Timestamps modifiedAt) {
}
