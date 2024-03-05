package org.example.AuctionSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAuctionSpring {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AuctionAppConfig.class);
        BidderSpring arja = (BidderSpring) applicationContext.getBean("Arja");
        BidderSpring john = (BidderSpring) applicationContext.getBean("John");
        BidderSpring ned = (BidderSpring) applicationContext.getBean("Ned");
        arja.bid(100);
        john.bid(150);
        ned.bid(200);
        arja.bid(20);
    }
}
