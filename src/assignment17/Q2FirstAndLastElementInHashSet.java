package assignment17;

import java.util.HashSet;
import java.util.Iterator;

public class Q2FirstAndLastElementInHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
       // set.add(null);
        set.add(66);
        set.add(65);
        set.add(101);
        set.add(19);
        set.add(13);
        System.out.println("Elements of set are: ");
        for(Integer i : set){
            System.out.println(i);
        }

        Iterator<Integer> iterator = set.iterator();
        int firstElement = iterator.next();
        //System.out.println("First element: "+firstElement);
        int lastElement = 0;
        System.out.println("elements");
        while(iterator.hasNext()){
            int element = iterator.next();
            //System.out.println(element);
            if(!iterator.hasNext()){
                lastElement = element;
                //System.out.println("Last element: "+lastElement);
            }
        }
        System.out.println("size of set is: "+set.size());
        System.out.println("firstElement of hashset is: "+firstElement);
        System.out.println("lastElement of hashset is: "+lastElement);
    }
}

/*
Elements of set are:
1
65
2
66
3
19
101
13
size of set is: 8
firstElement of hashset is: 1
lastElement of hashset is: 13

 */
/*
HashSet's order is - unordered
 */