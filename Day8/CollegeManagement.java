package Day8;
class Person2 {
    void details() {
        System.out.println("Person Details");
    }
}

class Student extends Person2 {
    void study() {
        System.out.println("Student Studies");
    }
}

class Teacher extends Person2 {
    void teach() {
        System.out.println("Teacher Teaches");
    }
}

public class CollegeManagement {
    public static void main(String[] args) {

        Student s = new Student();
        Teacher t = new Teacher();

        s.details();
        s.study();

        t.details();
        t.teach();
    }
}
