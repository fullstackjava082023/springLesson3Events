package org.example.CustomEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;


    //here I will publish custom event
    public void publishEvent(String message) {
        CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, message);
        applicationEventPublisher.publishEvent(customSpringEvent);
    }

    //here i will publish user registered event
    public void publishUserRegistered(String userEmail) {
        //creates the event of type UserRegisteredEvent
        UserRegisteredEvent userRegisteredEvent = new UserRegisteredEvent(this, userEmail);
        //publish the event
        applicationEventPublisher.publishEvent(userRegisteredEvent);
    }

}
