package assignment10;

import java.util.concurrent.Callable;

class Shape{
    public void calculateArea(){
        System.out.println("Parent class calculateArea method");
    }
}
class Circle extends Shape{
    public float calculateArea(int radius) {
       float area =  (float)(3.14*radius*radius);
        System.out.println("area of circle class: "+area);
       return area;
    }
}
class Rectangle extends Shape{
    public int calculateArea(int length,int breadth){
        int area = length*breadth;
        System.out.println("area of rectangle class is: "+area);
       return area;
    }
}
class Triangle extends Shape{
    public float calculateArea(int base, int height) {
       float area = (float) (0.5*base*height);
        System.out.println("area of triangle class is: "+area);
        return area;
    }
}
public class Q1ShapesArea {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea(5);
        Rectangle rectangle = new Rectangle();
        rectangle.calculateArea(12,2);
        Triangle triangle = new Triangle();
        triangle.calculateArea(5,6);

    }
}
/*
area of circle class: 78.5
area of rectangle class is: 24
area of triangle class is: 15.0

 */