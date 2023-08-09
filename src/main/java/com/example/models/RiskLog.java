package com.example.models;

import com.example.enums.RiskLogTypeEnum;
import com.google.protobuf.util.Timestamps;

public record RiskLog(String logId,
                      String riskId,
                      RiskLogTypeEnum logType,
                      String logDetails,
                      Timestamps createdAt) {
}
