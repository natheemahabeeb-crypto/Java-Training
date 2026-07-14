package Day11;

abstract class Vehicles {
    abstract void start();
}

class Bike extends Vehicles {
    void start() {
        System.out.println("Bike Started");
    }
}

public class Vehicles2 {
    public static void main(String[] args) {
        Vehicles v = new Bike();
        v.start();
    }
}