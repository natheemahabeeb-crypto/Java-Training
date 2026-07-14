package Day13;

  
abstract class Shape1 {
    abstract void area();
}

class Circle1 extends Shape1 {
    void area() {
        System.out.println(3.14 * 5 * 5);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Shape1 s = new Circle1();
        s.area();
    }
}
