package Day13;

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void display() {
        System.out.println(balance);
    }
}

public class Program3 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(5000);
        b.display();
    }
}
