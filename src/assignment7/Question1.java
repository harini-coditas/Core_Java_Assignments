package assignment7;

import java.util.*;
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
   public void arrayEquals(){
       System.out.println();
       if(Arrays.equals(array1,array2)){

           System.out.println("The arrays are Equal");
       }
       else{
           System.out.println("The arrays are Not Equal");
       }


    }
}
public class Question1 {
    public static void main(String[] args) {
        ArrayMethods method1 = new ArrayMethods();
        System.out.println("The sorted array is: ");
        method1.sortingArray();
        method1.arrayEquals();

    }
}
/*
Output:
The sorted array is:
1 5 19 60 130 489
The array are not equal

Process finished with exit code 0The sorted array is:
 */
