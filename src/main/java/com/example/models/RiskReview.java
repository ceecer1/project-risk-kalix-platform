package com.example.models;

import com.google.protobuf.util.Timestamps;

public record RiskReview(String reviewId,
                         String riskId,
                         String reviewerId,
                         Timestamps reviewDate,
                         String reviewComments) {
}
