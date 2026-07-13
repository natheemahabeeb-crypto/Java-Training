package Day8;
public class Car {

    String brand;

    Car(String brand) {
        this.brand = brand;
    }

    void display() {
        System.out.println(brand);
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW");
        Car c2 = new Car("Audi");
        Car c3 = new Car("Tesla");

        c1.display();
        c2.display();
        c3.display();
    }
}