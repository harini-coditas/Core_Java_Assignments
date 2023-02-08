package assignment7;

import java.util.Arrays;
class ArrayMethods{
    int array1[] = {1 ,489, 60, 19 , 130 ,5};
    int array2[] = {2, 4, 67, 19, 130, 5};
    public void sortingArray(){
        Arrays.sort(array1);
        for(int element : array1){
            System.out.print(element +" ");
        }
    }
   public void arrayAsList(){
       System.out.println();
        System.out.println("The array as list is: "+Arrays.asList(array1));

    }
}
public class Question1 {
    public static void main(String[] args) {
        ArrayMethods method1 = new ArrayMethods();
        System.out.println("The sorted array is: ");
        method1.sortingArray();
        method1.arrayAsList();

    }
}
