package org.example.AuctionSpring;

import org.example.Auction.Auctioneer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;


@Component
public class AuctioneerSpring {
    private int highestBid = 0;
    private String winnerName = "";

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    //this method accepts the new bid
    public void acceptBid(int newBid, String name) {
        if (newBid > highestBid) {
            this.highestBid = newBid;
            this.winnerName = name;
            //here we should create new bidEvent
            BidEvent bidEvent = new BidEvent(this, this.winnerName, this.highestBid);
            System.out.println("publishing new event");
            //publish the new bid event
            applicationEventPublisher.publishEvent(bidEvent);
        } else {
            System.out.println("the bid: " + newBid + "from player: " + name + " denied and the state not changed");
        }
        //this method gets new amount and the name
        //if the amount is higher :
            //1 updating the highestbid
            //2 updating the winner name
            //3 (new) publish "BidEvent" - //send to all that new bid happened
                     //3.1 we need to inject a Spring publisher
                     //3.2 we need to call publish of the spring publisher
    }



}
