package evaluation3;


class RectangleTest{
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
    public void rectangleArea(){
        int area = getLength()*getBreadth();
        System.out.println("The area of rectangle is :"+area);
    }
    public void rectanglePerimeter(){
        int per = 2*(getLength()+getBreadth());
        System.out.println("The Perimeter of rectangle is :"+per);
    }
}
public class Question1 {
    public static void main(String[] args) {
        RectangleTest newRectangle = new RectangleTest();
        newRectangle.setLength(12);
        newRectangle.setBreadth(4);
        newRectangle.rectangleArea();
        newRectangle.rectanglePerimeter();
    }
}

  /*
    Output---
        The area of rectangle is :48
        The Perimeter of rectangle is :32

        Process finished with exit code 0
*/