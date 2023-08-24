package patterns.behavioral.visitor.challenge;

import java.util.ArrayList;
import java.util.List;

public class Client {

    // normal shopping cart stuff
    private static List<Visitable> items = new ArrayList<>();

    public static double calculatePostage(Visitor visitor) {
        // iterate through all items
        for (Visitable item : items) {
            item.accept(visitor);
        }
        double totalPostage = visitor.getTotalPostageForCart();
        return totalPostage;
    }

    public static void main(String[] args) {
        // create a bunch of visitors (Book, CD, and DVD)
        Visitable book = new Book(15, 2.3);
        Visitable cd = new CD(7, 0.2);
        Visitable dvd = new DVD(30, 0.4);

        // add each visitor to the List
        items.add(book);
        items.add(cd);
        items.add(dvd);

        Visitor usVisitor = new USPostageVisitor();
        double usPostage = calculatePostage(usVisitor);
        System.out.println("The total postage for my items is: " + usPostage); // The total postage for my items is: 5.1

        Visitor saVisitor = new SouthAmericaPostageVisitor();
        double saPostage = calculatePostage(saVisitor);
        System.out.println("The total postage for my items is: " + saPostage); // The total postage for my items is: 10.2
    }
}
