package Day9;
class Vehicle {
    void show() {
        System.out.println("Vehicle");
    }
}

class Car extends Vehicle {
    void show() {
        System.out.println("Car");
    }
}

class Bike extends Vehicle {
    void show() {
        System.out.println("Bike");
    }
}

public class Vehicle1{
    public static void main(String[] args) {

        Vehicle[] v = {
            new Car(),
            new Bike()
        };

        for (Vehicle obj : v) {
            obj.show();
        }
    }
}