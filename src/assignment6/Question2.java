package assignment6;

class CodeSnippet2{
    int number1 = 3;
    public void display() {
        if (number1 >= 0) {
            if (number1 == 0) {
                System.out.println("first");
            }
        }
        else {
            System.out.println("second");
        }
        System.out.println("third");
    }
}
public class Question2 {
    public static void main(String[] args) {
        System.out.println("The output of CodeSnippet2 is: ");
        CodeSnippet2 test = new CodeSnippet2();
        test.display();

    }
}
