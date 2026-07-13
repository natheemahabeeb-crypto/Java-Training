package Day10;
public class Main1 {

    static void largest(int... a) {
        int max = a[0];

        for (int i : a)
            if (i > max)
                max = i;

        System.out.println("Largest = " + max);
    }

    public static void main(String[] args) {
        largest(10, 25, 15, 40, 5);
    }
}
