package Day14;

class Animal1 {
    void sound() {
        System.out.println("Animal");
    }
}

class Dog1 extends Animal1 {
    void sound() {
        System.out.println("Bark");
    }
}

public class Program8 {
    public static void main(String[] args) {
        Animal1 a = new Dog1();
        a.sound();
    }
}
