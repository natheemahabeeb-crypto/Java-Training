package Day8;
public class BankAccount {

    String name;
    int balance;

    BankAccount() {
        this("Unknown", 0);
    }

    BankAccount(String name) {
        this(name, 1000);
    }

    BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println(name + " " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("Natheema");
        BankAccount b3 = new BankAccount("Aisha", 5000);

        b1.display();
        b2.display();
        b3.display();
    }
}
