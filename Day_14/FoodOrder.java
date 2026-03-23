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

    public static void main(String[] args) {
        
    }
}