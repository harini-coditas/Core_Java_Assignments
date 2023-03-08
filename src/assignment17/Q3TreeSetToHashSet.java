package assignment17;

import java.util.HashSet;
import java.util.TreeSet;

public class Q3TreeSetToHashSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("India");
        treeSet.add("USA");
        treeSet.add("Canada");
        System.out.println("Printing TreeSet elements: "+treeSet);
        HashSet<String> hashSet = new HashSet<>(treeSet);
        System.out.println("Printing HashSet elements: "+hashSet);

        System.out.println("*******************************");

        TreeSet<Integer> treeSet1 = new TreeSet<Integer>();
        treeSet1.add(1);
        treeSet1.add(57);
        treeSet1.add(13);
        treeSet1.add(109);
        treeSet1.add(13);
        System.out.println("Printing TreeSet elements: "+treeSet1);
        HashSet<Integer> hashSet1 = new HashSet<>(treeSet1);
        System.out.println("Printing HashSet elements: "+hashSet1);

        System.out.println("*******************************");

        TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
        treeSet2.add(1);
        treeSet2.add(57);
        treeSet2.add(13);
        treeSet2.add(109);
        treeSet2.add(13);
        System.out.println("Printing TreeSet elements: "+treeSet2);
        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.addAll(treeSet2);
        System.out.println("Printing HashSet elements: "+hashSet2);

        System.out.println("*******************************");

        TreeSet<Float> treeSet3 = new TreeSet<Float>();
        treeSet3.add(1.01f);
        treeSet3.add(57.0f);
        treeSet3.add(13.8f);
        treeSet3.add(19.1f);;
        System.out.println("Printing TreeSet elements: "+treeSet3);
        HashSet<Float> hashSet3 = new HashSet<>();
        for(Float f : treeSet3){
            hashSet3.add(f);
        }
        System.out.println("Printing HashSet elements: "+hashSet3);
    }
}

/*
Printing TreeSet elements: [Canada, India, USA]
Printing HashSet elements: [Canada, USA, India]
*******************************
Printing TreeSet elements: [1, 13, 57, 109]
Printing HashSet elements: [1, 57, 13, 109]
*******************************
Printing TreeSet elements: [1, 13, 57, 109]
Printing HashSet elements: [1, 57, 13, 109]
*******************************
Printing TreeSet elements: [1.01, 13.8, 19.1, 57.0]
Printing HashSet elements: [13.8, 57.0, 19.1, 1.01]

 */