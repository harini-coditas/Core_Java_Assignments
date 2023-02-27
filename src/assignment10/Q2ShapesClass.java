package assignment10;

class RectangleDemo implements Q2InterfaceShape{
  int length = 0;
  int width = 0;
  RectangleDemo(){
      System.out.println("no args Constructor");
  }
  RectangleDemo(int length,int width){
      System.out.println("Parameterized constructor");
      this.length = length;
      this.width = width;
  }
    @Override
    public void getArea() {
     double area = length*width;
        System.out.println("Area of rectangle is: "+area);
    }

    @Override
    public String toString() {
        return "RectangleDemo{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
class TriangleDemo implements Q2InterfaceShape{
    int base = 0;
    int height = 0;
    TriangleDemo(){
        System.out.println("no args Constructor");
    }
    TriangleDemo(int base,int height){
        System.out.println("Parameterized Constructor");
        this.base = base;
        this.height = height;
    }
    @Override
    public void getArea() {
        double area = 0.5*base*height;
        System.out.println("Area of triangle is: "+area);
    }

    @Override
    public String toString() {
        return "TriangleDemo{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
public class Q2ShapesClass {
    public static void main(String[] args) {
        RectangleDemo rectangleDemo1 = new RectangleDemo();
        rectangleDemo1.getArea();
        RectangleDemo rectangleDemo2 = new RectangleDemo(13,19);
        rectangleDemo2.getArea();
        TriangleDemo triangleDemo = new TriangleDemo(1,2);
        triangleDemo.getArea();
    }
}

/*
no args Constructor
Area of rectangle is: 0.0
Parameterized constructor
Area of rectangle is: 247.0
Parameterized Constructor
Area of triangle is: 1.0
 */