package restaurant.services;

import restaurant.models.*;

import java.util.Scanner;

public class RestaurantService {

    public void startSystem() {

        Scanner scanner = new Scanner(System.in);

        Order order = new Order();

       
        FoodItem burger = new FoodItem("Burger", 8.5, "Fast Food");
        FoodItem pizza = new FoodItem("Pizza", 12.0, "Italian");

        DrinkItem cola = new DrinkItem("Cola", 3.0, true);
        DrinkItem coffee = new DrinkItem("Coffee", 4.0, false);

        System.out.println("===== RESTAURANT MENU =====");

        burger.displayItem();
        pizza.displayItem();
        cola.displayItem();
        coffee.displayItem();

        boolean running = true;

        while (running) {

            try {

                System.out.println("\nChoose an item:");
                System.out.println("1. Burger");
                System.out.println("2. Pizza");
                System.out.println("3. Cola");
                System.out.println("4. Coffee");
                System.out.println("5. Finish Order");

                System.out.print("Enter choice: ");

                int choice = scanner.nextInt();

                switch (choice) {

                    case 1:
                        order.addItem(burger);
                        System.out.println("Burger added.");
                        break;

                    case 2:
                        order.addItem(pizza);
                        System.out.println("Pizza added.");
                        break;

                    case 3:
                        order.addItem(cola);
                        System.out.println("Cola added.");
                        break;

                    case 4:
                        order.addItem(coffee);
                        System.out.println("Coffee added.");
                        break;

                    case 5:
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid option.");
                }

            } catch (Exception e) {

                
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }

        order.showOrder();

        scanner.close();
    }
}
