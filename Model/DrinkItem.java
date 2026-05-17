package restaurant.models;


public class DrinkItem extends MenuItem {

    private boolean cold;

    public DrinkItem(String name, double price, boolean cold) {
        super(name, price);
        this.cold = cold;
    }

    
    @Override
    public void displayItem() {

        String type;

        if (cold) {
            type = "Cold";
        } else {
            type = "Hot";
        }

        System.out.println("Drink: " + getName()
                + " | Type: " + type
                + " | Price: $" + getPrice());
    }
}
