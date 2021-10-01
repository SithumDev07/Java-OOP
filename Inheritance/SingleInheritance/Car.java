package Inheritance.SingleInheritance;

class Vehicle {
    Vehicle() {
        System.out.println("Vehicle");
    }

    void apply() {
        System.out.println("Apply");
    }
}

public class Car extends Vehicle {
    Car() {
        System.out.println("Car");
        apply(); // * Methods of parent class can call directly.
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.apply();
    }
}
