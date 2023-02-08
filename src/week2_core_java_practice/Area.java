package week2_core_java_practice;

class Rectangle{
    private int length;
    private int breadth;
    private int area;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getArea() {
        //area = length*breadth;
        return getLength()*getBreadth();
    }



    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                ", area=" + area +
                '}';
    }




}
public class Area {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        //System.out.println(rectangle);
        rectangle.setLength(12);
        rectangle.setBreadth(4);
        rectangle.getArea();
        System.out.println("Area of rectangle is: "+rectangle.getArea());
       // System.out.println("Area of rectangle is: "+rectangle.getBreadth()*rectangle.getLength());
        //System.out.println(rectangle);
    }
}

/*
Output:
Area of rectangle is: 48

Process finished with exit code 0

 */