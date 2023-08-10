package patterns.creational.builder.challenge;

import java.util.ArrayList;
import java.util.List;

// represent a Product in a Builder pattern
public class Meal {
    private List<Item> items;

    public Meal() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float totalCost = 0;
        for (Item item : items) {
            totalCost += item.getPrice();
        }
        
        return totalCost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item : " + item.getName() + ", Packing : " + item.getPacking().pack() + ", Price: " + item.getPrice());
        }
    }
}
