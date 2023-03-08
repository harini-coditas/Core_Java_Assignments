package assignment17;

import java.util.HashSet;
import java.util.TreeSet;

public class Q4HashSetToTreeSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Harini");
        hashSet.add("Bala");
        hashSet.add("Krati");
        hashSet.add("Shreya");
        System.out.println("Printing hashSet: "+hashSet);
        TreeSet<String> treeSet = new TreeSet<>(hashSet);
        System.out.println("Printing treeSet: "+treeSet);

        System.out.println("**************************");

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(19);
        hashSet1.add(0);
        hashSet1.add(121);
        System.out.println("Printing hashSet: "+hashSet1);
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        for(Integer i : hashSet1){
            treeSet1.add(i);
        }
        System.out.println("Printing treeSet: "+treeSet1);

        System.out.println("**************************");

        HashSet<Boolean> hashSet2 = new HashSet<Boolean>();
        hashSet2.add(true);
        hashSet2.add(false);
        hashSet2.add(true);
        hashSet2.add(true);
        System.out.println("Printing hashSet: "+hashSet2);
        TreeSet<Boolean> treeSet2 = new TreeSet<>();
        treeSet2.addAll(hashSet2);
        System.out.println("Printing treeSet: "+treeSet2);

    }
}

/*
Printing hashSet: [Shreya, Harini, Krati, Bala]
Printing treeSet: [Bala, Harini, Krati, Shreya]
**************************
Printing hashSet: [0, 1, 19, 121]
Printing treeSet: [0, 1, 19, 121]
**************************
Printing hashSet: [false, true]
Printing treeSet: [false, true]
 */