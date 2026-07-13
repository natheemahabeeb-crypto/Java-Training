package Day8;

public class Student1 {

    Student1() {
        this(101);
        System.out.println("Default Constructor");
    }

    Student1(int id) {
        System.out.println("ID = " + id);
    }

    public static void main(String[] args) {
        new Student1();
    }
}
