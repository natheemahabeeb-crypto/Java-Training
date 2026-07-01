package Day5;

public class SmallestElement {
    
    public static void main(String[] args) {
        int[] arr = {12, 45, 8, 67, 23};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest = " + min);
    }
}
    

