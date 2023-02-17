package evaluation3;


interface InterfaceSquare{
    public abstract int side;
    InterfaceSquare(int side){
        this.side=side;
    public void squareArea(int side){
        int area=side*side;
    }
    public void squarePer(int side){
        int per=side*side;
    }
        }
public interface InterfaceTest {
    public static void main(String[] args) {
        InterfaceSquare square = new InterfaceSquare(4) ;
        square.squareArea(4);
        square.squarePer(4);
        }
    }


}
