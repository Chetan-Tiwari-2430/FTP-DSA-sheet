import java.util.Map;
import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 1, 4, 2, 3, 1};

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println(map);
    }
}