package restaurant.models;

import java.util.ArrayList;

public class Order {

    
    private ArrayList<MenuItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void showOrder() {

        double total = 0;

        System.out.println("\n----- ORDER SUMMARY -----");

        
        for (MenuItem item : items) {
            item.displayItem();
            total += item.getPrice();
        }

        System.out.println("-------------------------");
        System.out.println("Total Price: $" + total);
    }
}
