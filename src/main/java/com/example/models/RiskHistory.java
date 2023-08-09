package com.example.models;

import com.example.enums.RiskStatusEnum;
import com.google.protobuf.util.Timestamps;

public record RiskHistory(String historyId,
                          String riskId,
                          RiskStatusEnum previousStatus,
                          RiskStatusEnum newStatus,
                          Timestamps updatedAt
                          ) {
}
