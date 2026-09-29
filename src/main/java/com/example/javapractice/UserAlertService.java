package com.example.javapractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserAlertService {
    private Notification notification;

    @Autowired
    public UserAlertService(Notification notification) {
        this.notification = notification;
    }

    void alertUser(String msg) {
          notification.sendNotification(msg);

    }
}
