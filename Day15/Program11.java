package Day15;

interface Printer1{
    void print();
}

class Laser1 implements Printer1{
    public void print(){
        System.out.println("Laser Printer");
    }
}

class Computer1{
    Printer1 p;

    Computer1(Printer1 p){
        this.p=p;
    }

    void start(){
        p.print();
    }
}

public class Program11{
    
    public static void main(String[] args){
        Computer1 c=new Computer1(new Laser1());
        c.start();
    }
}
