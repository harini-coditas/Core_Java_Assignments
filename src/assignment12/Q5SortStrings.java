package assignment12;
import java.util.*;
import java.util.Scanner;

class AscendingStringSort{
    public void display() {
        Scanner sc = new Scanner(System.in);
        String strArray[] = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the string" +i);
              strArray[i] = sc.nextLine();
        }
        sort(strArray);
        System.out.println("Strings after sorting: ");
        for(int k=0;k<5;k++){
            System.out.println(strArray[k]);
        }
    }
    public void sort(String[] str){
        for(int i=0;i<5;i++){
            for(int j=0; j<5-1 ;j++) {
                if (str[j].length() > str[j + 1].length()) {
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
    }
}
class ReplaceVowelWithNextChar{
    public void nextChar(String str){
        System.out.println("Original string is: "+str);
        String string = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U'){
                ch = (char)(ch+1);
            }
            string += ch;
        }
        System.out.println("String after replacing vowels with next char is: "+string);
    }
}
public class Q5SortStrings {
    public static void main(String[] args) {
        ReplaceVowelWithNextChar replaceVowel = new ReplaceVowelWithNextChar();
        replaceVowel.nextChar("HariniBathini");
        System.out.println("------------");
        AscendingStringSort ascendingStringSort = new AscendingStringSort();
        ascendingStringSort.display();

    }
}


/*
Output --

Original string is: HariniBathini
String after replacing vowels with next char is: HbrjnjBbthjnj
------------
Enter the string0
harini
Enter the string1
bathini
Enter the string2
har
Enter the string3
bat
Enter the string4
hari
Strings after sorting:
har
bat
hari
harini
bathini
 */