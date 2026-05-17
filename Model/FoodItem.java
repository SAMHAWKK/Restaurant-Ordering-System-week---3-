package restaurant.models;


public class FoodItem extends MenuItem {

    private String category;

    public FoodItem(String name, double price, String category) {
        super(name, price);
        this.category = category;
    }

  
    @Override
    public void displayItem() {
        System.out.println("Food: " + getName()
                + " | Category: " + category
                + " | Price: $" + getPrice());
    }
}
