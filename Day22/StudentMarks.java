package Day22;
import java.util.HashMap;

public class StudentMarks {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Alice", 90);
        map.put("Bob", 85);
        map.put("John", 95);

        System.out.println(map);
    }
}