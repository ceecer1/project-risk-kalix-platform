package com.example.models;

import com.google.protobuf.util.Timestamps;

public record Attachment(String attachmentId,
                         String riskId,
                         String fileName,
                         String filePath,
                         Timestamps createdAt) {
}
