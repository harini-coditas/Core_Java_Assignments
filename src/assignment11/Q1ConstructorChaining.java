package assignment11;
import java.util.*;
class Animal{
    int noOfLegs = 2;
    String color = "";
    public void display(){
        System.out.println("This is parent class");
    }
    Animal(){
        System.out.println("This is no arguments constructor");
    }
    Animal(int noOfLegs,String color){
        this.noOfLegs = noOfLegs;
        this.color = color;
        System.out.println("Parameterized constructor");
    }

}
class Dog extends Animal{
    Dog(){
        System.out.println("No arguments constructor of child");
    }
    Dog(int noOfLegs,String dogColor){
        super(noOfLegs,dogColor);
    }
    public void display(){
        System.out.println("This is child method");
        System.out.println("Dog has: "+noOfLegs+" legs and it is of color: "+color);
    }

}
public class Q1ConstructorChaining {
    public static void main(String[] args) {
       Dog dog = new Dog(4,"Brown");
       dog.display();
    }
}
/*
Parameterized constructor
This is child method
Dog has: 4 legs and it is of color: Brown

 */
/*
Theory-
In Java, constructor chaining is a sequence of invoking constructors upon initializing an object.
It is used when we want to invoke a number of constructors, one after another by using only an instance.
In constructor chain, a constructor is called from another constructor in the same class this process is known as constructor chaining.
It occurs through inheritance. When we create an instance of a derived class, all the constructors of the inherited class (base class)
are first invoked, after that the constructor of the calling class (derived class) is invoked.
We can achieve constructor chaining in two ways:
Within the same class: If the constructors belong to the same class, we use "this"
From the base class: If the constructor belongs to different classes (parent and child classes),
we use the "super" keyword to call the constructor from the base class.
 */