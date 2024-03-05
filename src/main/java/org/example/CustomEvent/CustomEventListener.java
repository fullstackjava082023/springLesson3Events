package org.example.CustomEvent;


import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.EventObject;

@Component
public class CustomEventListener {

    @EventListener
    public void onApplicationEvent(CustomSpringEvent event) {
        //here is the reaction to event
        System.out.println("I got an event:" + event.getMessage());
    }

    @EventListener
    public void onAnotherEvent(UserRegisteredEvent event) {
        //here is the reaction to event
        System.out.println("Sending welcome Email to:" + event.getUserEmail());
    }
}
