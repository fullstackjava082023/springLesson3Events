package org.example.Auction;

public class Bidder implements Subscriber {

    public String playerName;

    public Auctioneer publisher;

    public Bidder(String playerName, Auctioneer publisher) {
        this.playerName = playerName;
        this.publisher = publisher;
    }

    @Override
    public void update() {
        System.out.println(this.playerName + " recieved update of the state " + publisher.getState());
    }

    public void bid(int amount) {
        System.out.println(this.playerName + " trying to place a bid: " + amount );
        publisher.acceptBid(amount, this.playerName);
    }
}
