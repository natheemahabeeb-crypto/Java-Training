package Day22;

import java.util.HashMap;

public class CheckValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 10);
        map.put("B", 20);

        System.out.println(map.containsValue(20));
    }
}