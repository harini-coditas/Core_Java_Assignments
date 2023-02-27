package assignment12;

import java.util.Scanner;
import java.util.*;
class RemoveRepeated{
    public void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string ");
        String string = sc.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        String strNew = "";
        for(int i=0;i<string.length();i++){
            if(list.contains(string.charAt(i))){

            }else{
                list.add(string.charAt(i));
                strNew += Character.toString(string.charAt(i));
            }
        }
        System.out.println("New string after removing repeated chars is: "+strNew);
    }
}
public class Q3RemoveRepeatedChars {
    public static void main(String[] args) {
        RemoveRepeated removeRepeated = new RemoveRepeated();
        removeRepeated.display();
    }
}

/*
Output -

Enter the string
harinibathini
New string after removing repeated chars is: harinbt

 */