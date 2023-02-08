package assignment7;

import java.util.Arrays;
class CopyArray{
    int array1[] = {21, 24, 1, 13, 115, -9};
    public void copyArrayIntoArray() {
        System.out.println("Original Array is: " + Arrays.toString(array1));
        System.out.println("New Array is: "+Arrays.toString(Arrays.copyOf(array1,6)));

        /*
        int array2[] = new int[6];
        for(int i=0;i<array1.length;i++){
            array2[i]=array1[i];
        }
        System.out.println("New Array is: "+Arrays.toString(array2));
         */
    }
}
public class Question3 {
    public static void main(String[] args) {
        CopyArray newArray = new CopyArray();
        newArray.copyArrayIntoArray();
    }
}

/*
Output:
Original Array is: [21, 24, 1, 13, 115, -9]
New Array is: [21, 24, 1, 13, 115, -9]

Process finished with exit code 0

 */