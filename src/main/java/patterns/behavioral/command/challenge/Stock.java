package patterns.behavioral.command.challenge;

// Receiver
public class Stock {
    private String name = "Google";
    private int quantity = 1000;

    public void buy() {
        System.out.println("Stock BOUGHT: " + name + " Quantity: " + quantity);
    }

    public void sell() {
        System.out.println("Stock SOLD: " + name + " Quantity: " + quantity);
    }
}

// Concrete Command for Buy
class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}

// Concrete Command for Sell
class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
