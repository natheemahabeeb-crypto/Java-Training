package Day8;

public class Employee1 {

    int id = 101;               // Instance variable
    static String company = "ABC Pvt Ltd"; // Static variable

    void display() {
        int salary = 30000;     // Local variable

        System.out.println("ID: " + id);
        System.out.println("Company: " + company);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee1 e = new Employee1();
        e.display();
    }
}