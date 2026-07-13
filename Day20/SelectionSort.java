package Day20;

public class SelectionSort {
    
    public static void main(String[] args) {

        int[] arr = {5, 2, 9, 1, 7};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int maxIndex = i;

            // Find the largest element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        System.out.println("Array in Descending Order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
    
