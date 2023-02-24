package assignment14;

import java.util.Scanner;
public class CustomExceptionDepositWithdraw {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter '1' for DEPOSIT and enter '2' for WITHDRAWAL");
        int value = sc.nextInt();
        AmountExceptionChecker amountExceptionChecker = new AmountExceptionChecker();
        if(value==1) {
            System.out.println("Please enter DEPOSIT AMOUNT");
            int num1 = sc.nextInt();
            amountExceptionChecker.deposit(num1);
        }
        if(value==2) {
            System.out.println("Please enter the withdrawal amount");
            int num2 = sc.nextInt();
            amountExceptionChecker.withdrawal(num2);
        }


    }
}
