package Day11;

public class Main1 {

    static void sum(int... a) {
        int total = 0;

        for (int i : a)
            total += i;

        System.out.println(total);
    }

    public static void main(String[] args) {
        sum(10, 20, 30, 40);
    }
}