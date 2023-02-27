package assignment10;

class Animal{
    public void eat(){
        System.out.println("parent method..");
        System.out.println("Animal eats");
    }

}
//class Monkey extends Animal{
//    public int eat(){
//        System.out.println("child monkey method..");
//        System.out.println("monkey eats bananas");
//        int noOfbananas = 6;
//        return noOfbananas;
//    }
//}
//class Dog extends Animal{
//    public String eat(){
//        System.out.println("child dog method..");
//        System.out.println("dog eats biscuits");
//        String food = "biscuits";
//        return food;
//    }
//}
public class Q4OverridingReturnType {
    public static void main(String[] args) {
//        Monkey monkey = new Monkey();
//        Dog dog = new Dog();
    }
}

/*
C:\Users\Coditas\IdeaProjects\Core_Java_Assignments\src\assignment10\Q4OverridingReturnType.java:11:16
java: eat() in assignment10.Monkey cannot override eat() in assignment10.Animal
  return type int is not compatible with void
 */
/*
--Before Java5, it was not possible to override any method by changing the return type.
 But now, since Java5, it is possible to override method by changing the return type if
  subclass overrides any method whose return type is Non-Primitive but it changes its return type to subclass type.
--Java doesn't allow the return type-based overloading, but JVM always allows return type-based overloading.
 JVM uses the full signature of a method for lookup/resolution. Full signature means it includes
  return type in addition to argument types. i.e., a class can have two or more methods differing only by return type.
   javac uses this fact to implement covariant return types.
 */