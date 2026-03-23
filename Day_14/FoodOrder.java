package Day_14;
import java.util.*;

public class FoodOrder {

    static abstract class Food {
        String name;

        Food(String name) {
            this.name = name;
        }

        abstract double getPrice();

        void display() {
            System.out.println("Food Item: " + name);
        }
    }

    static class Pizza extends Food {
        Pizza() {
            super("Pizza");
        }

        @Override
        double getPrice() {
            return 500;
        }
    }

    static class Burger extends Food {
        Burger() {
            super("Burger");
        }

        @Override
        double getPrice() {
            return 250;
        }
    }

    static class Sandwich extends Food {
        Sandwich() {
            super("Sandwich");
        }

        @Override
        double getPrice() {
            return 150;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Food> orders = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();

        int choice = 0;

        do {
            System.out.println("\n=== Food Menu ===");
            System.out.println("1. Pizza (Rs.500)");
            System.out.println("2. Burger (Rs.250)");
            System.out.println("3. Sandwich (Rs.150)");
            System.out.println("4. Checkout");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                sc.next(); 
                continue;
            }

            choice = sc.nextInt();
            Food food = null;

            switch(choice) {
                case 1:
                    food = new Pizza();
                    break;
                case 2:
                    food = new Burger();
                    break;
                case 3:
                    food = new Sandwich();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            if (choice >= 1 && choice <= 3) {
                System.out.print("Enter quantity: ");

                if (!sc.hasNextInt()) {
                    System.out.println("Invalid quantity!");
                    sc.next();
                    continue;
                }

                int qty = sc.nextInt();

                orders.add(food);
                quantities.add(qty);

                System.out.println(food.name + " added to cart!");
            }

        }    }
}