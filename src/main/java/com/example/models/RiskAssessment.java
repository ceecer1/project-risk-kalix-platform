package com.example.models;

import com.example.enums.RiskLevelEnum;
import com.google.protobuf.util.Timestamps;

public record RiskAssessment(String assessmentId,
                             String riskId,
                             String assessorId,
                             int probabilityScore,
                             int impactScore,
                             RiskLevelEnum riskLevel,
                             Timestamps assessmentDate) {
}
