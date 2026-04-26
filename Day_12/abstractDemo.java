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

class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    void startEngine() {
        System.out.println("Car engine starts with a key or button.");
    }

    void stopEngine() {
        System.out.println("Car engine stops when ignition is off.");
    }

    void fuelType() {
        System.out.println("Car uses petrol or diesel.");
    }
}


public class abstractDemo {
    public static void main(String[] args) {

    }
}