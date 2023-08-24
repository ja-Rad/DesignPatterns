package patterns.behavioral.strategy.implementation;

public class Client {
    public static void main(String[] args) {
        ShoppingCartContext context = new ShoppingCartContext();
        Item item1 = new Item("1", 100);
        Item item2 = new Item("2", 200);
        Item item3 = new Item("3", 300);

        context.addItem(item1);
        context.addItem(item2);
        context.addItem(item3);

        // pay by PayPal
        context.pay(new PayPalStrategy("example@email.com", "Test@123")); // 600 paid using PayPal

        // pay by Credit Card
        context.pay(new CreditCardStrategy(
                "John Doe",
                "1234 1234 1234 1234",
                "123",
                "01/99")
        ); // 600 paid with credit/debit card

    }
}
