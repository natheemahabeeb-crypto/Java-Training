package Day6;

public class OddIndex {
    
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};

        for (int i = 1; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
    }
}
    

