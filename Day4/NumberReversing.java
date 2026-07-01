package Day4;

public class NumberReversing {
    
    public static void main(String[] args) {

        int num = 98765;
        int reverse = 0;

        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }

        System.out.println("Original Number = 98765");
        System.out.println("Reversed Number = " + reverse);
    }
}
    

