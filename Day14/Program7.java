package Day14;

interface Notify {
    void send();
}

class Email1 implements Notify {
    public void send() {
        System.out.println("Email Sent");
    }
}

public class Program7 {
    public static void main(String[] args) {
        Notify n = new Email1();
        n.send();
    }
}
