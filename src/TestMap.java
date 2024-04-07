import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Long", 25);
        hashMap.put("Khoa", 23);
        hashMap.put("Linh", 21);
        hashMap.put("Huyen", 35);
        hashMap.put("Phuong", 15);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap + "\n");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Long", 25);
        linkedHashMap.put("Khoa", 23);
        linkedHashMap.put("Linh", 21);
        linkedHashMap.put("Huyen", 35);
        linkedHashMap.put("Phuong", 15);
        System.out.println("\nThe age for " + "Long is " + linkedHashMap.get("Long"));
    }
}
