package org.example.Auction;

public class MainAuction {
    public static void main(String[] args) {
        Auctioneer auctioneer = new Auctioneer();
        Bidder player1 = new Bidder("Arja", auctioneer);
        Bidder player2 = new Bidder("John", auctioneer);
        Bidder player3 = new Bidder("Ned", auctioneer);
        auctioneer.subscribe(player1);
        auctioneer.subscribe(player2);
        auctioneer.subscribe(player3);

        System.out.println(auctioneer.getState());

        player1.bid(100);
        player2.bid(120);
        player1.bid(139);
        player3.bid(200);
        auctioneer.unSubscriber(player1);
        player1.bid(250);
        player2.bid(249);
    }
}
