package com.udacity.jwdnd.c1.review;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.udacity.jwdnd.c1.review.ReviewApplication;


@Service
public class MessageService {
    private String message;

    public MessageService(String message){
        this.message = message;
    }

    public String uppercase(){
        return message.toUpperCase();
    }

    public String lowercase(){
        return message.toLowerCase();
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Message Service bean being created");
    }
}