package com.example.javapractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class
JavaPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaPracticeApplication.class, args);

EmailNotification email = new EmailNotification();
        UserAlertService userAlertService = new UserAlertService(email);
        userAlertService.alertUser("Server slow");
    }


}


