package assignment18;

import java.util.HashMap;
import java.util.Map;

public class HashMapSizeCheck {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Aarti");
        map.put(1,"Aarti");
        map.put(3,"Aarti");
        map.put(3,"Harini");
        map.put(4,"Aarti");
        map.put(5,"Aarti");
        map.put(5,"Aarti");
        map.put(5,"Harini");
        map.put(5,"Aarti");
//        Map<String> map = new HashMap<>();
//        map.put("Aarti");
//        map.put("Aarti");
       System.out.println(map.size());
        System.out.println(map);
//        HashMapSizeCheck o1 = new HashMapSizeCheck();
//        HashMapSizeCheck o2 = new HashMapSizeCheck();
    }
}
