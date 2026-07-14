package Day12;
interface Music {
    void play();
}

class MP3 implements Music {
    public void play() {
        System.out.println("Playing MP3");
    }
}

class Spotify implements Music {
    public void play() {
        System.out.println("Playing Spotify");
    }
}

class Player {
    Music m;

    Player(Music m) {
        this.m = m;
    }

    void start() {
        m.play();
    }
}

public class Main {
    public static void main(String[] args) {
        Player p = new Player(new MP3());
        p.start();

        p = new Player(new Spotify());
        p.start();
    }
}
