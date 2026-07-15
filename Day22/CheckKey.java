package Day22;

import java.util.HashMap;

public class CheckKey {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 100);
        map.put("Orange", 80);

        System.out.println(map.containsKey("Apple"));
    }
}