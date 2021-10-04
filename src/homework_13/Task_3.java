package homework_13;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Task_3 {
    public static void main(String[] args) {
        String str="Some words gonna be written in this words document";
        String []arr =str.split(" ");

        Map<String, Integer> map = new LinkedHashMap<>();
        for (String word: arr) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            if (map.get(key) == 1) {
                break;
            }
        }
        System.out.println(map);
    }
}
