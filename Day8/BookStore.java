package Day8;
public class BookStore {

    String title;
    int price;

    BookStore(String title, int price) {
        this.title = title;
        this.price = price;
    }

    void display() {
        System.out.println(title + " : Rs." + price);
    }

    public static void main(String[] args) {
        BookStore b = new BookStore("Java Programming", 750);
        b.display();
    }
}