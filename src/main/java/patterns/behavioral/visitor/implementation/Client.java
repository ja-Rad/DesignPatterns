package patterns.behavioral.visitor.implementation;

public class Client {
    public static void main(String[] args) {
        ItemElement[] items = {
                new Book(20, "1234"),
                new Book(100, "5678"),
                new Fruit(2, 4, "Banana"),
                new Fruit(3, 5, "Watermelon")
        };

        int total = calculatePrice(items);
        System.out.println("Total cost = " + total);
        /*
            Book ISBN:: 1234 cost = 20
            Book ISBN:: 5678 cost = 95
            Banana cost = 8
            Watermelon cost = 15
            Total cost = 138
         */
    }

    private static int calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;

        for (ItemElement itemElement : items) {
            sum += itemElement.accept(visitor);
        }

        return sum;
    }
}
