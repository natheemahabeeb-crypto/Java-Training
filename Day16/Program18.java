package Day16;

class MyThread extends Thread{

    public void run(){
        System.out.println("Thread Running");
    }

}

public class Program18{
    public static void main(String[] args){

        MyThread t=new MyThread();
        t.start();

    }
}
