package assignment7;

import java.util.*;
class GetNthIndexElement{
    int array[] = {7, 9, 13, 1, 0, 67};
    Scanner sc = new Scanner(System.in);
    int index=sc.nextInt();

    int result = 0;
    public void elementIndex(){
        for(int element : array){
            result = array[index];
        }
        System.out.println("Element at Nth index of array is: "+result);
    }
}
public class Question6 {
    public static void main(String[] args) {
        System.out.println("Input the index of the element");
        GetNthIndexElement elementAtIndex = new GetNthIndexElement();
        elementAtIndex.elementIndex();
    }
}
/*
Output:
Input the index of the element
2
Element at Nth index of array is: 13

Process finished with exit code 0
 */