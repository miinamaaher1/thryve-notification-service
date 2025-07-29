package com.thryve.notification.domain.Entities;

import java.time.LocalDateTime;

import com.thryve.notification.domain.Enums.NotificationSubject;

import lombok.Data;

@Data
public class Notification {
    private String id;
    private String sourceUserId;
    private String targetUserId;
    private NotificationSubject subject;
    private LocalDateTime timestamp;
    private String postId;
    private String commentId;
}
