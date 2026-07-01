package Day7;

public class LastOccurence {
 
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40};
        int key = 20;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == key) {
                System.out.println("Last occurrence at index: " + i);
                break;
            }
        }
    }
}
    

