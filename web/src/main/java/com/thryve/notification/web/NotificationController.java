package com.thryve.notification.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import com.thryve.notification.application.NotificationService;
import com.thryve.notification.domain.Entities.Notification;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @GetMapping
    public List<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }

    @PutMapping("/{id}/read")
    public @ResponseBody String markNotificationRead(@PathVariable String id) {
        boolean success = notificationService.markNotificationRead(id);
        return success ? "Notification marked as read." : "Notification not found.";
    }
}
