package Day16;

public class Program16{
    public static void main(String[] args){

        try{
            int a=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Error");
        }
        catch(Exception e){
            System.out.println("General Error");
        }

    }
}
