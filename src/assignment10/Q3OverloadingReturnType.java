package assignment10;

class Addition{
    public int add(int num1,int num2){
        int sum = num1 + num2;
        System.out.println("sum of integers as integer is: "+sum);
        return sum;
    }
//    public double add(int num1,int num2){
//        double sum = (double)(num1 + num2);
//        System.out.println("sum of integers as double is: "+sum);
//        return sum;
//    }
}
public class Q3OverloadingReturnType {
    public static void main(String[] args) {
       Addition addition = new Addition();
       addition.add(2,3);
    }
}
/*
C:\Users\Coditas\IdeaProjects\Core_Java_Assignments\src\assignment10\Q3OverloadingReturnType.java:9:19
java: method add(int,int) is already defined in class assignment10.Addition
 */

/*
Method overloading cannot be done by changing the return type of methods.
The most important rule of method overloading is that two overloaded methods must have different parameters.
It is not possible to decide to execute which method based on the return type, therefore,
overloading is not possible just by changing the return type of the method.
 */