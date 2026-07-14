package Day13;

abstract class Vehicle1 {
    abstract void start();
}

class Bike1 extends Vehicle1 {
    void start() {
        System.out.println("Bike Started");
    }
}

public class Program5 {
    public static void main(String[] args) {
        Vehicle1 v = new Bike1();
        v.start();
    }
}
