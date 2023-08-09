package com.example.models;

import com.google.protobuf.util.Timestamps;

public record RiskTemplate(String templateId,
                           String title,
                           String description,
                           int defaultProbability,
                           int defaultImpact,
                           Timestamps createdAt,
                           Timestamps updatedAt) {
}
