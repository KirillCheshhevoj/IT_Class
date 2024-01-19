package Lesson_20;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main20 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
//        System.out.println(map.keySet());
//        System.out.println(map.values());
        System.out.println(map);

        TreeMap<String, Integer> map2 = new TreeMap<>();
        map2.put("One", 1);
        map2.put("Two", 2);
        map2.put("Three", 3);
        map2.put("Four", 4);
        System.out.println(map2);
        System.out.println(map2.ceilingEntry("2"));
    }
}
