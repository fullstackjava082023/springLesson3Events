package org.example.AuctionSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BidderSpring {
    private String name;

    public BidderSpring(String name) {
        this.name = name;
    }

    //we ask spring to inject the Auctioneer from the container - automatic
    @Autowired
    private AuctioneerSpring auctioneerSpring;

    public void bid(int newPrice) {
        //we take the Auctioneeer
        auctioneerSpring.acceptBid(newPrice, this.name);
        //and we calling acceptBid
            //parameter 1 -> newPrice
            //parameter 2 -> this.name
    }

    //we should get update when the new bid accepted
    //we should here catch the bid event
    //to listen for event we need annotate with @EventListener
    @EventListener
    public void onBidEvent(BidEvent event) {
        //here we can do any code
        //for this example we will just print that we got an update
        System.out.println("I am "+ this.name + " I got an update" + " and the new winner name is " + event.getBidderName() + " and the new highest bid is : " + event.getBidAmount());
    }


}
