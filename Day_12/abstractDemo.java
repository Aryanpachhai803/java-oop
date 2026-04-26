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

class Bike extends Vehicle {

    Bike(String brand) {
        super(brand);
    }

    void startEngine() {
        System.out.println("Bike engine starts with a self-start or kick.");
    }

    void stopEngine() {
        System.out.println("Bike engine stops with a switch.");
    }

    void fuelType() {
        System.out.println("Bike uses petrol.");
    }
}

class Truck extends Vehicle {

    Truck(String brand) {
        super(brand);
    }

    void startEngine() {
        System.out.println("Truck engine starts with heavy ignition.");
    }

    void stopEngine() {
        System.out.println("Truck engine stops slowly.");
    }

    void fuelType() {
        System.out.println("Truck uses diesel.");
    }
}

public class abstractDemo {
    public static void main(String[] args) {

    }
}