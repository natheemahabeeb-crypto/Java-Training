package Day6;

public class SumTwoArrays {
    
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i] + arr2[i];
        }

        System.out.println("Sum of Both Arrays = " + sum);
    }
}
    

