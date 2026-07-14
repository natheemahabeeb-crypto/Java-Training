package Day11;
interface Printer {
    void print();
}

class Inkjet implements Printer {
    public void print() {
        System.out.println("Inkjet Printing");
    }
}

class Laser implements Printer {
    public void print() {
        System.out.println("Laser Printing");
    }
}

class Computer {
    Printer p;

    Computer(Printer p) {
        this.p = p;
    }

    void startPrint() {
        p.print();
    }
}

public class Main {
    public static void main(String[] args) {
        Computer c = new Computer(new Inkjet());
        c.startPrint();

        c = new Computer(new Laser());
        c.startPrint();
    }
}