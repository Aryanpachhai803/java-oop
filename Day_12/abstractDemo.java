package Day_12;

abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void startEngine();
    abstract void stopEngine();
    abstract void fuelType();

    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

public class abstractDemo {
    public static void main(String[] args) {

    }
}