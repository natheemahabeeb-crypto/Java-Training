package Day15;

public class Program14{
    public static void main(String[] args){

        try{
            int n=Integer.parseInt("ABC");
        }
        catch(NumberFormatException e){
            System.out.println("NumberFormatException");
        }

    }
}
