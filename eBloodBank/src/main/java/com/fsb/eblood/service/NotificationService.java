package com.fsb.eblood.service;


import com.fsb.eblood.dao.entities.Event;
import com.fsb.eblood.dao.entities.Notification;
import com.fsb.eblood.dao.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public Notification saveNotification(Notification notification){

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        notification.setCreatedAt(dtf.format(LocalDateTime.now()));
        return notificationRepository.save(notification);
    }

    public void deleteNotif(Event event) {
        notificationRepository.deleteByEvent(event);
    }
}
