package Day12;

class Employee {
    private int id;
    private String name;

    public void setId(int id) {
        if (id > 0)
            this.id = id;
        else
            System.out.println("Invalid ID");
    }

    public void setName(String name) {
        if (name.length() > 2)
            this.name = name;
        else
            System.out.println("Invalid Name");
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class Main5 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(101);
        e.setName("John");

        System.out.println(e.getId());
        System.out.println(e.getName());
    }
}
