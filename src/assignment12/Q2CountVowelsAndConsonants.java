package assignment12;
import java.util.Scanner;
public class Q2CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string name");
        String name = sc.nextLine();
       // String name = "ChatrapatiShivaji";
        int countV = 0;
        int countC = 0;
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch=='a' || ch =='e'|| ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch =='E'|| ch=='I' || ch=='O' || ch=='U'){
                countV++;
            }else{
                countC++;
            }
        }

        System.out.println("Name is :"+name+" - length of name is :"+name.length());
        System.out.println("Count of vowels is :"+countV);
        System.out.println("Count of consonants is :"+countC);
    }
}

/*
Output -

Enter the string name
HariniBathini
Name is :HariniBathini - length of name is :13
Count of vowels is :6
Count of consonants is :7
 */