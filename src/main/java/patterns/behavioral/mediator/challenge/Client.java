package patterns.behavioral.mediator.challenge;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new AuctionMediator();

        Buyer buyer1 = new AuctionBuyer(mediator, "Pudge");
        Buyer buyer2 = new AuctionBuyer(mediator, "Shrek");
        Buyer buyer3 = new AuctionBuyer(mediator, "Nicolas");
        // Now mediator knows about all of them

        mediator.addBuyer(buyer1);
        mediator.addBuyer(buyer2);
        mediator.addBuyer(buyer3);
        /*
            Pudge was added to the buyers list...
            Shrek was added to the buyers list...
            Nicolas was added to the buyers list...
         */

        System.out.println("--------- AUCTION STARTS ---------");
        buyer1.bid(3000);
        buyer2.bid(100);
        buyer3.bid(50);
        mediator.findHighestBidder();
        /*
            The Auction has ended for this person: Pudge
            The Auction has ended for this person: Shrek
            The Auction has ended for this person: Nicolas
            The auction winner is Pudge || He paid 3000$ for the item
         */

        buyer1.cancelBid();
        System.out.println(buyer1.name + " || Has canceled their bid! Rerun the Auction:");
        mediator.findHighestBidder();
        /*
            Pudge || Has canceled their bid! Rerun the Auction:
            The Auction has ended for this person: Pudge
            The Auction has ended for this person: Shrek
            The Auction has ended for this person: Nicolas
            The auction winner is Shrek || He paid 100$ for the item
         */

    }
}
