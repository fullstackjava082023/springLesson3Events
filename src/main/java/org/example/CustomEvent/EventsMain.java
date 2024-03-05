package org.example.CustomEvent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventsMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(EventsAppConfig.class);

        CustomEventPublisher customEventPublisher = context.getBean(CustomEventPublisher.class);
        customEventPublisher.publishEvent("Stam Event");
        customEventPublisher.publishEvent("User Registered");
        customEventPublisher.publishEvent("Arja start to be no one");

        //user did the registration
        customEventPublisher.publishUserRegistered("arja@gmail.com");

    }
}
