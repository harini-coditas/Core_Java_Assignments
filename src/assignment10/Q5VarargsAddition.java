package assignment10;

class GeneralAddition{
    public void add(int num1,int num2){
        int sum = num1+num2;
        System.out.println("sum of add method1 is: "+sum);
    }
    public void add(int num1,int num2,int num3){
        int sum = num1+num2+num3;
        System.out.println("sum of add method2 is: "+sum);
    }
}
class VarargsAddition{
    public void add(int ...intArray){
        int sum = 0;
        for(int i : intArray){
            sum += i;
        }
        System.out.println("sum of varargs method is: "+sum);
    }
}
public class Q5VarargsAddition {
    public static void main(String[] args) {
        GeneralAddition addition = new GeneralAddition();
        addition.add(1,2);
        addition.add(3,4,5);
        VarargsAddition varargsAddition = new VarargsAddition();
        varargsAddition.add(1,2,3,4,5,6,7);
        varargsAddition.add(1,1,1,1,1,1,1,1,1,1,1,1,1,1);
    }
}

/*
sum of add method1 is: 3
sum of add method2 is: 12
sum of varargs method is: 28
sum of varargs method is: 14
 */