package com.example.javapractice;

import org.springframework.stereotype.Component;

@Component
public class SMSNotification implements Notification {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS Notification has been sent: " + message);

    }
}
