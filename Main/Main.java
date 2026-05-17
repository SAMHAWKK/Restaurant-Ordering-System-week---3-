package restaurant.main;

import restaurant.services.RestaurantService;

public class Main {

    public static void main(String[] args) {

        RestaurantService service = new RestaurantService();

        service.startSystem();
    }
}
