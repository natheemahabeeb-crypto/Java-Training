package Day7;

public class FirstOccurence {
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40};
        int key = 20;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("First occurrence at index: " + i);
                break;
            }
        }
    }
}
    

