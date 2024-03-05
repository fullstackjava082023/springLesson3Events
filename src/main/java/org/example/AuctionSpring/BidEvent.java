package org.example.AuctionSpring;

import org.springframework.context.ApplicationEvent;

public class BidEvent extends ApplicationEvent {
    private String bidderName;
    private int bidAmount;

    public BidEvent(Object source, String bidderName, int bidAmount) {
        super(source);
        this.bidderName = bidderName;
        this.bidAmount = bidAmount;
    }

    //we will need to complete implementation according to Spring rules:
        //1. extends ApplicationEvent
        //2. in constructor we should call super(source) //intializing the super class

    //biddername and bidamount we will get in the constructor //from the publisher


    public String getBidderName() {
        return bidderName;
    }

    public int getBidAmount() {
        return bidAmount;
    }
}
