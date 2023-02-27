package assignment12;

import java.util.*;
class ConvertStringToArray{
    public void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        String str = sc.nextLine();
        char[] strArray = str.toCharArray();
        System.out.println("After conversion: ");
        for(int i=0;i<strArray.length;i++) {
            System.out.println(strArray[i]);
        }
    }
}
public class Q6StringToArray {
    public static void main(String[] args) {
        ConvertStringToArray convert = new ConvertStringToArray();
        convert.display();
    }
}

/*
enter the string:
Harini Bathini
After conversion:
H
a
r
i
n
i

B
a
t
h
i
n
i
 */