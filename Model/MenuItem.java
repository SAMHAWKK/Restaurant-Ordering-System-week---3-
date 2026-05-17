package restaurant.models;

// Abstraction
public abstract class MenuItem {

    // Encapsulation
    private String name;
    private double price;

    // Constructor
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method
    public abstract void displayItem();
}
