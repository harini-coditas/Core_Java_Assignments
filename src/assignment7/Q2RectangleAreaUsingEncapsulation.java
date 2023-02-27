package assignment7;

class Rectangle{
    private int length;
    private int breadth;

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
//    public void area(){
//        //int area = this.length*this.breadth;
//        int area = getLength()*getBreadth();
//        System.out.println("Rectangle area is: "+area);
//    }

}
public class Q2RectangleAreaUsingEncapsulation {
    public static void main(String[] args) {
      Rectangle rectangle = new Rectangle();
      rectangle.setLength(12);
      rectangle.setBreadth(2);
      //rectangle.area();
        System.out.println("Area of rectangle is: "+rectangle.getLength()* rectangle.getBreadth());
    }
}
/*
Area of rectangle is: 24
 */