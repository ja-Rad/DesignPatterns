package patterns.behavioral.mediator.challenge;

public abstract class Buyer {
    protected Mediator mediator;
    protected String name;
    protected int price;

    public Buyer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void bid(int price);

    public abstract void cancelBid();

    public abstract void auctionHasEnded();
}

class AuctionBuyer extends Buyer {
    public AuctionBuyer(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void bid(int price) {
        this.price = price;
    }

    @Override
    public void cancelBid() {
        this.price = -1; // flag that we are no longer bidding
    }

    @Override
    public void auctionHasEnded() {
        System.out.println("The Auction has ended for this person: " + name);
    }
}
