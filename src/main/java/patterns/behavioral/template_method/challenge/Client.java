package patterns.behavioral.template_method.challenge;

public class Client {
    public static void main(String[] args) {
        OrderProcessTemplate templateNetOrder = new NetOrder();
        templateNetOrder.processOrder(true);
        /*
            Gift wrap was Successful
            Item was added to online shopping cart
            Get Gift wrap preference
            Get delivery address...
            Online Payment through Net-banking, card or PayPal...
            Ship the item through Post Office to delivery address...
         */
        System.out.println("--------------------------------------");

        OrderProcessTemplate templateStoreOrder = new StoreOrder();
        templateStoreOrder.processOrder(false);
        /*
            Customer chooses the item from Shelf...
            Pays at counter through cash/Point of Sale...
            Item delivered to in delivery counter...
         */

    }
}
