package org.example.Auction;

public interface Publisher {

    void subscribe(Subscriber subscriber);

    void unSubscriber(Subscriber subscriber);

    void notifySubscribers();


}
