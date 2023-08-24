package patterns.behavioral.mediator.challenge;

import java.util.ArrayList;
import java.util.List;

public interface Mediator {
    void addBuyer(Buyer buyer);

    void findHighestBidder();
}

class AuctionMediator implements Mediator {
    // this class implements the mediator and holds all the buyers in an arrayList.
    // We can add buyers and find the highest bidder.

    private List<Buyer> buyers;

    public AuctionMediator() {
        buyers = new ArrayList<>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.name + " was added to the buyers list...");
    }

    @Override
    public void findHighestBidder() {
        int maxBid = 0;
        Buyer winner = null;

        for (Buyer buyer : buyers) {
            if (buyer.price > maxBid) {
                maxBid = buyer.price;
                winner = buyer;
            }
            buyer.auctionHasEnded();
        }
        System.out.println("The auction winner is " + winner.name + " || He paid " + winner.price + "$ for the item");
    }
}