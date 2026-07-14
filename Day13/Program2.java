package Day13;

class StudentData {
    private int roll;
    private String name;

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(roll + " " + name);
    }
}

public class Program2 {
    public static void main(String[] args) {
        StudentData s = new StudentData();
        s.setRoll(1);
        s.setName("Alice");
        s.show();
    }
}
