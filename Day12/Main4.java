package Day12;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        System.out.println("Area = " + (3.14 * 5 * 5));
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area = " + (5 * 4));
    }
}

public class Main4 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}
