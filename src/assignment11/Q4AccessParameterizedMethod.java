package assignment11;

class AddNumbers{
    AddNumbers(){
        System.out.println("Default Constructor");
    }
    AddNumbers(int num1,int num2,int num3){
        System.out.println("Parameterized constructor");
        int result = num1+num2+num3;
        System.out.println("Result is: "+result);
    }
}
public class Q4AccessParameterizedMethod {
    public static void main(String[] args) {
        AddNumbers add = new AddNumbers(1,2,3);
    }
}

/*
Parameterized constructor
Result is: 6
 */