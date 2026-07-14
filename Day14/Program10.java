package Day14;

public class Program10 {

    static void max(int... n) {
        int m = n[0];

        for(int i:n)
            if(i>m)
                m=i;

        System.out.println(m);
    }

    public static void main(String[] args) {
        max(5,7,3,9);
    }
}
