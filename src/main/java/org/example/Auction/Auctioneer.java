package org.example.Auction;

import java.util.ArrayList;
import java.util.List;

public class Auctioneer implements Publisher {

    List<Subscriber> subscribers = new ArrayList();
    int highestBid = 0;
    String winnerName = "";

    @Override
    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    @Override
    public void unSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        System.out.println("notifying subscribers");
        for (Subscriber subscriber : subscribers) {
            subscriber.update();
        }
    }
    public String getState() {
        return "Highest bid is : " + highestBid + " and curent leader " +
                "is : " + winnerName;
    }

    public void acceptBid(int amount, String name) {
        if (amount > highestBid) {
            highestBid = amount;
            winnerName = name;
            notifySubscribers();
        } else {
            System.out.println("the bid: " + amount + "from player: " + name + " denied and the state not changed");
        }
    }

}
