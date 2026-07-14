package Day15;

interface Music1{
    void play();
}

class MP31 implements Music1{
    public void play(){
        System.out.println("Playing MP3");
    }
}

class Player1{
    Music1 m;

    Player1(Music1 m){
        this.m=m;
    }

    void start(){
        m.play();
    }
}

public class Program12{
    public static void main(String[] args){
        Player1 p=new Player1(new MP31());
        p.start();
    }
}
