package assignment6;

import java.util.Scanner;
class GreatestOf2{
   Scanner sc = new Scanner(System.in);
   int number1 = sc.nextInt();
   int number2 = sc.nextInt();
   public void greatest(){
        if(number1 > number2 ){
            System.out.println("Greatest of number1 and number2 is : "+number1);
        }
        else if(number1 < number2 ){
            System.out.println("Greatest of number1 and number2 is : "+number2);
        }
        else if(number1 == number2 ){
            System.out.println("number1 and number2 are equal : "+number1);
        }
    }
}
public class Question5 {
    public static void main(String[] args) {
        GreatestOf2 test = new GreatestOf2();
        test.greatest();
    }
}
