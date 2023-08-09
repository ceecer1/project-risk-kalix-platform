package com.example.models;

import com.example.enums.MitigationTaskStatusEnum;
import com.google.protobuf.util.Timestamps;

/**
 * Associated with a Risk
 */
public record MitigationTask(String taskId,
                             String title,
                             String description,
                             Timestamps dueDate,
                             MitigationTaskStatusEnum taskStatus,
                             Timestamps createdAt,
                             Timestamps modifiedAt
                             ) {
}
