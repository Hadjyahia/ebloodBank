package com.fsb.eblood.web.controller;


import com.fsb.eblood.dao.entities.Notification;
import com.fsb.eblood.dao.entities.Event;
import com.fsb.eblood.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notification")
@CrossOrigin(origins = "http://localhost:4200/")
public class NotificationController {

    @Autowired
    NotificationService notificationService;

    @PostMapping("/save")
    public Notification saveNotification(@RequestBody Notification notification){
        return notificationService.saveNotification(notification);
    }


    @DeleteMapping("/delete")
    public void deleteUser(@RequestBody Event event){

        notificationService.deleteNotif(event);
    }

}
