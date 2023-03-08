package assignment17;

import java.util.HashSet;

public class Q5HashSetToArray {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(12);
        hashSet.add(24);
        hashSet.add(23);
        hashSet.add(15);
        hashSet.add(4);
        hashSet.add(20);
        hashSet.add(17);
        System.out.println("Printing hashSet elements: "+hashSet);
        int array[] = new int[hashSet.size()];
        System.out.println("Printing array elements: ");
        int j=0;
        for(int i : hashSet){
            array[j] = i;
            System.out.println(array[j]);
        }

        System.out.println("**********************");


        int intArray[] = hashSet.stream().mapToInt(Integer::intValue).toArray();
        for(int i = 0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}

/*
Printing hashSet elements: [17, 4, 20, 23, 24, 12, 15]
Printing array elements:
17
4
20
23
24
12
15
**********************
17
4
20
23
24
12
15

 */