package org.example.AuctionSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.example.AuctionSpring")
public class AuctionAppConfig {


    //I need for example 3 players
    // 1 Arja BidderSpring
    // 2 john BidderSpring
    // 3 Ned BidderSpring

    @Bean("Arja")
    public BidderSpring arjaBidder() {
        return new BidderSpring("Arja");
    }

    @Bean("John")
    public BidderSpring johnBidder() {
        return new BidderSpring("John");
    }

    @Bean("Ned")
    public BidderSpring nedBidder() {
        return new BidderSpring("Ned");
    }

    @Bean
    public AuctioneerSpring getAuctioneer() {
        return new AuctioneerSpring();
    }

}
