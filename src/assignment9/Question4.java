package assignment9;

abstract class Shape{

    public abstract void area();


}
class Circle extends Shape{
    int radius;
    @Override
    public void area() {
        double circleArea = 3.14 * radius * radius;
        System.out.println("Area of circle is: "+circleArea);
    }
    Circle(int radius){

        this.radius = radius;
    }
}
class Square extends Shape{
    int length;
    Square(int length){

        this.length = length;
    }

    @Override
    public void area() {
        double squareArea = length * length;
        System.out.println("Area of square is: "+squareArea);
    }
}
class Cylinder extends Circle{

    int height;

    Cylinder(int radius,int height) {
        super(radius);
        this.height = height;
    }

    @Override
    public void area() {
       radius  = super.radius;

       double cylinderArea = 3.14 * radius * radius * height;
        System.out.println("Area of cylinder is: "+cylinderArea);
    }
}
class Rectangle extends Square{
    int breadth;
    Rectangle(int length,int breadth){
        super(length);
       // this.length = length;
        this.breadth = breadth;
    }


    @Override
    public void area() {
       length = super.length;
        double rectangleArea = length * breadth;
        System.out.println("Area of Rectangle is: "+rectangleArea);
    }
}
public class Question4 {
    public static void main(String[] args) {
        Circle circle = new Circle(8);
        circle.area();
        Square square = new Square(5);
        square.area();
        Cylinder cylinder = new Cylinder(6,3);
        cylinder.area();
        Rectangle rectangle = new Rectangle(5,4);
        rectangle.area();

    }
}

/*
Area of circle is: 200.96
Area of square is: 25.0
Area of cylinder is: 339.12
Area of Rectangle is: 20.0
 */