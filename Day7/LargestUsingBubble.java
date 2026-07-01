package Day7;

public class LargestUsingBubble {
   
    public static void main(String[] args) {
        int[] arr = {12, 67, 5, 89, 34};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Largest = " + arr[arr.length - 1]);
    }
}
    

