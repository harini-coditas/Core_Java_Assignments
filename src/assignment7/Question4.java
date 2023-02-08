package assignment7;
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        int[] array = {5,6, 1, 3, 4, 9, 4, 1};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (list.contains(array[i])) {
                System.out.println("Duplicate element is : " + array[i]);
            }
            else {
                list.add(array[i]);
            }
        }
        System.out.println("Array after removing duplicates is: ");
        for (Integer a : list) {
            System.out.println(a);
        }
    }
}
/*
Output:
Duplicate element is : 4
Duplicate element is : 1
Array after removing duplicates is:
5
6
1
3
4
9

Process finished with exit code 0

 */
