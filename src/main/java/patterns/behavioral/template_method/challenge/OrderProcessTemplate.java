package patterns.behavioral.template_method.challenge;

public abstract class OrderProcessTemplate {
    public boolean isGift;

    public abstract void doSelect();

    public abstract void doPayment();

    public abstract void doDelivery();

    public final void giftWrap() {
        System.out.println("Gift wrap was Successful");
    }

    // the actual template method
    public final void processOrder(boolean isGift) {
        if (isGift) {
            giftWrap();
        }
        doSelect();
        doPayment();
        doDelivery();
    }
}

class NetOrder extends OrderProcessTemplate {

    @Override
    public void doSelect() {
        System.out.println("Item was added to online shopping cart");
        System.out.println("Get Gift wrap preference");
        System.out.println("Get delivery address...");
    }

    @Override
    public void doPayment() {
        System.out.println("Online Payment through Net-banking, card or PayPal...");
    }

    @Override
    public void doDelivery() {
        System.out.println("Ship the item through Post Office to delivery address...");
    }
}

class StoreOrder extends OrderProcessTemplate {

    @Override
    public void doSelect() {
        System.out.println("Customer chooses the item from Shelf...");
    }

    @Override
    public void doPayment() {
        System.out.println("Pays at counter through cash/Point of Sale...");

    }

    @Override
    public void doDelivery() {
        System.out.println("Item delivered to in delivery counter...");

    }
}
