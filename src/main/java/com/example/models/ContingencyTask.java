package com.example.models;

import com.example.enums.ContingencyTaskStatusEnum;
import com.google.protobuf.util.Timestamps;

public record ContingencyTask(String taskId,
                              String title,
                              String description,
                              Timestamps dueDate,
                              ContingencyTaskStatusEnum taskStatus,
                              Timestamps createdAt,
                              Timestamps modifiedAt) {
}
