package Day8;
class Person {
    void personInfo() {
        System.out.println("Person");
    }
}

class Employee extends Person {
    void employeeInfo() {
        System.out.println("Employee");
    }
}

class Manager extends Employee {
    void managerInfo() {
        System.out.println("Manager");
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.personInfo();
        m.employeeInfo();
        m.managerInfo();
    }
}