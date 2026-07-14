package Day14;

public class Program9 {

    static void sum(int... n) {
        int s = 0;
        for (int i : n)
            s += i;
        System.out.println(s);
    }

    public static void main(String[] args) {
        sum(10,20,30);
    }
}
