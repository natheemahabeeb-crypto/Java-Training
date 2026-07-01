package Day5;

public class CopyArray {
    
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20};
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}
    

