package assignment14;

public class InvalidAmountException extends Exception{
    InvalidAmountException(){

    }
    InvalidAmountException(String amount){
        System.out.println("The amount you have entered is :"+amount);
    }
}
