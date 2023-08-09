package com.example.models;

import com.google.protobuf.util.Timestamps;

public record AuditTrail(String trailId,
                         String userId,
                         String action,
                         String actorId,
                         String details,
                         Timestamps performedAt) {
}
