package evaluation2;

import java.util.*;
class ArrayOperations{
    Scanner sc = new Scanner(System.in);
    //int length = sc.nextInt();
    int array[] = {1,2,1,2,1,2,1,2,1,2};
    int evenSumResult;
    int oddMultiplicationResult=1;
    public void operations(){
        for(int i=0; i< array.length ; i++){
            if(i == 0 || i%2 == 0){
                evenSumResult = evenSumResult+array[i];
            }
            else if(i%2!=0){
                oddMultiplicationResult = oddMultiplicationResult*array[i];
            }
        }
        System.out.println("Sum of all values at even indexes: "+evenSumResult);
        System.out.println("Result of multiplication of all values at odd indexes: "+oddMultiplicationResult);
    }

}
public class Question3 {
    public static void main(String[] args) {
        ArrayOperations newArray = new ArrayOperations();
        newArray.operations();
    }
}


/*
Output
Sum of all values at even indexes: 5
Result of multiplication of all values at odd indexes: 32

Process finished with exit code 0

 */