package com.thryve.notification.infrastructure.repository;

import com.thryve.notification.domain.Entities.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends MongoRepository<Notification, String> {
    // You can add custom query methods here if needed
}
