package Day16;

class MyRunnable implements Runnable{

    public void run(){
        System.out.println("Runnable Thread");
    }

}

public class Program19{
    public static void main(String[] args){

        Thread t=new Thread(new MyRunnable());
        t.start();

    }
}
