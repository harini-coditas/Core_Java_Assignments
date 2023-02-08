package assignment7;
import java.util.*;
class PrintSortedArray{
    Integer array[] = {23, 56, 711, 2 , 131, 0, -8, -14};
    public void ascendingArray(){
       Arrays.sort(array);
        System.out.println("The array in ascending order is: ");
        for(int element : array){
            System.out.print(element+" ");
        }
    }

    public void descendingArray(){
        System.out.println();
        System.out.println("The array in descending order is: ");
        Arrays.sort(array,Collections.reverseOrder());
        System.out.println(Arrays.toString(array));

       /*
        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i]+" ");
        }
        */
    }
}
public class Question2 {
    public static void main(String[] args) {
        PrintSortedArray arrayAsc = new PrintSortedArray();
        arrayAsc.ascendingArray();
        PrintSortedArray arrayDesc = new PrintSortedArray();
        arrayDesc.descendingArray();

    }
}

/*
Output:
The array in ascending order is:
-14 -8 0 2 23 56 131 711
The array in descending order is:
[711, 131, 56, 23, 2, 0, -8, -14]

Process finished with exit code 0

 */
