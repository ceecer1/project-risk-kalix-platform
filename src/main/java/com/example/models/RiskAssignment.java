package com.example.models;

import com.example.enums.TaskAssignmentStatusEnum;
import com.google.protobuf.util.Timestamps;

public record RiskAssignment(String assignmentId,
                             String riskId,
                             String assigneeId,
                             String assignedByUserId,
                             Timestamps assignmentDate,
                             Timestamps dueDate,
                             TaskAssignmentStatusEnum status,
                             Timestamps createdAt
                             ) {
}
