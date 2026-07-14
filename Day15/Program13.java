package Day15;

public class Program13{
    public static void main(String[] args){

        try{
            int a=10/0;
        }
        catch(Exception e){
            System.out.println("ArithmeticException");
        }

    }
}
