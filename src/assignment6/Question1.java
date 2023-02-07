package assignment6;

class CodeSnippet1{
    int number1=3;
    public void display(){
        if(number1>=0)
            if(number1==0)
                System.out.println("first");
            else
                System.out.println("second");
        System.out.println("third");
    }

}

public class Question1 {
    public static void main(String[] args) {
        System.out.println("The output of CodeSnippet1 is: ");
        CodeSnippet1 test = new CodeSnippet1();
        test.display();

    }

}
