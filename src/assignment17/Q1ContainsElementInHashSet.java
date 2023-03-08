package assignment17;

import java.util.HashSet;

public class Q1ContainsElementInHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(null);
        set.add(65);
        set.add(101);
        set.add(19);
        set.add(13);
        for(Integer i : set){
            System.out.println(i);
        }
        System.out.println("Does this hashset contains element '5' :"+set.contains(5));
        System.out.println("Does this hashset contains element '3' :"+set.contains(3));
        System.out.println("Does this hashset contains element 'null' :"+set.contains(null));
    }
}

/*
null
1
65
2
3
19
101
13
Does this hashset contains element '5' :false
Does this hashset contains element '3' :true
Does this hashset contains element 'null' :true

 */