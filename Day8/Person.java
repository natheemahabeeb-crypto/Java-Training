package Day8;
class Person {
    void displayPerson() {
        System.out.println("Person Details");
    }
}

class Employee extends Person {
    void displayEmployee() {
        System.out.println("Employee Details");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.displayPerson();
        e.displayEmployee();
    }
}
