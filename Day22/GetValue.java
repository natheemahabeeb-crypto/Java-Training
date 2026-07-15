package Day22;
import java.util.HashMap;

public class GetValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Math", 95);
        map.put("Science", 88);

        System.out.println(map.get("Math"));
    }
}
