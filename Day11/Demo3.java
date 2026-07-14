package Day11;
class Demo {

    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    void display() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Demo obj = new Demo();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.display();
    }
}
