package Day9;
class Furniture {
    void display() {
        System.out.println("Furniture");
    }
}

class Room {
    Furniture f = new Furniture();

    void display() {
        System.out.println("Room");
        f.display();
    }
}

public class House {

    Room r = new Room();

    public static void main(String[] args) {
        House h = new House();
        h.r.display();
    }
}
