package assignment16.q2innerclasses;

interface ShapeInterface{
    void area();
}
abstract class Animal{
    abstract void walk();
}
public class AnonymousClass {
    public static void main(String[] args) {
      ShapeInterface shape = new ShapeInterface() {
          @Override
          public void area() {
              System.out.println("This is (Anonymous)area method of interface ShapeInterface...");
          }
      };
      shape.area();
      Animal animal = new Animal() {
          @Override
          void walk() {
              System.out.println("This is abstract walk method of abstract class Animal");
          }
      };
      animal.walk();
    }
}

/*
This is (Anonymous)area method of interface ShapeInterface...
This is abstract walk method of abstract class Animal
 */