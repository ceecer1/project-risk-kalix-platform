package com.example.models;

import com.google.protobuf.util.Timestamps;

public record Notification(String notificationId,
                           String userId,
                           String content,
                           boolean isRead,
                           Timestamps createdAt) {
}
