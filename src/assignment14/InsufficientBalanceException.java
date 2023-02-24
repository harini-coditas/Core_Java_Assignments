package assignment14;

public class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(){

    }
    InsufficientBalanceException(String amount){
        System.out.println("The amount entered is :"+amount);
    }
}
