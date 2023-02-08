package assignment6;

class ConvertIfElseIfToSwitch{
    int var = 3;
    public void display(){
        switch(var){
            case 1:
                System.out.println("low");
                break;
            case 2:
                System.out.println("medium");
                break;
            case 3:
                System.out.println("high");
                break;
            default:
                System.out.println("abnormal");
        }
    }
}
public class Question3 {
    public static void main(String[] args) {
        System.out.println("The temperature for given variable is: ");
        ConvertIfElseIfToSwitch test = new ConvertIfElseIfToSwitch();
        test.display();
    }
}

/*
Output:
The temperature for given variable is:
high

Process finished with exit code 0
 */