package assignment12;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;
class RemoveSpaces{
    public void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        String string = sc.nextLine();
        System.out.println("length of orginal string is :"+string.length());
        System.out.println("String after removing leading and trailing spaces is: "+string.trim());
        System.out.println("length of string after removing spaces is :"+string.trim().length());
        string = string.trim();
        System.out.println("unicode of char at index 5 is: "+string.codePointAt(5));
//        char char1 = 'i';
//        int code = (int)char1;
//        System.out.println(code);

    }

}
public class Q4RemoveLeadingTrailingSpaces {
    public static void main(String[] args) {
        RemoveSpaces removeSpaces = new RemoveSpaces();
        removeSpaces.display();

    }
}

/*
Output -
enter the string
    hi all, i am harini bathini, !
length of orginal string is :37
String after removing leading and trailing spaces is: hi all, i am harini bathini, !
length of string after removing spaces is :30
 */