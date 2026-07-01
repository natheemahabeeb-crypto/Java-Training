package Day7;

public class CountOccurences {
   
    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 8, 5, 10};
        int key = 5;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }

        System.out.println("Occurrences = " + count);
    }
}
    

