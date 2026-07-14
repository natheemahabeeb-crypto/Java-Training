package Day14;

interface Payment1 {
    void pay();
}

class UPI1 implements Payment1 {
    public void pay() {
        System.out.println("UPI Payment");
    }
}

public class Program6 {
    public static void main(String[] args) {
        Payment1 p = new UPI1();
        p.pay();
    }
}