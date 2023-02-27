package assignment12;

public class Q1ReorderString {
    public static void main(String[] args) {
        String firstName = "Harini";
        String lastName = "Bathini";
        if(firstName.length()>lastName.length())
            System.out.println("I am "+lastName+" "+firstName);
        if(lastName.length()>=firstName.length())
            System.out.println("I am "+firstName+" "+lastName);
    }
}

/*
Output -
I am Harini Bathini
 */
