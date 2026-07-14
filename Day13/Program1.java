package Day13;

class EmployeeData {
    private int id;
    private String name;

    public void setId(int id) {
        if (id > 0)
            this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(id + " " + name);
    }
}

public class Program1 {
    public static void main(String[] args) {
        EmployeeData e = new EmployeeData();
        e.setId(101);
        e.setName("John");
        e.display();
    }
}