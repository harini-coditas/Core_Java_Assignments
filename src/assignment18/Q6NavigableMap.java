package assignment18;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Q6NavigableMap {
    public static void main(String[] args) {
        NavigableMap<String,Integer> nm = new TreeMap<>();

        nm.put("C", 888);
        nm.put("Y", 111);
        nm.put("A", 121);
        nm.put("Z", 234);
        nm.put("T", 897);
        nm.put("B", 777);

        System.out.println("Mappings of NavigableMap: "+nm);
        System.out.println("Descending set: "+nm.descendingKeySet());
//        System.out.println("Floor Entry: "+nm.floorEntry("Q"));
        System.out.println("Floor Entry: "+nm.floorEntry("Z"));
        System.out.println("first entry: "+nm.firstEntry());
        System.out.println("last key: "+nm.lastKey());
        System.out.println("first key: "+nm.firstKey());
        System.out.println("Original map: "+nm);
        System.out.println("reverse map: "+nm.descendingMap());

        Iterator<Map.Entry<String,Integer> > itr = nm.entrySet().iterator();

        System.out.println("traversing using iterator: ");

        while (itr.hasNext()){
            NavigableMap.Entry<String,Integer> entry = itr.next();
            System.out.println("key = "+entry.getKey()+",value = "+entry.getValue());
        }
    }
}
