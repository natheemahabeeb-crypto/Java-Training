package Day6;

public class FrequencyArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 2, 4, 5};
        int element = 2;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                count++;
            }
        }

        System.out.println("Frequency of " + element + " = " + count);
    }
}
    

