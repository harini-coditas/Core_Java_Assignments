package assignment13;

class ParentShape{
    int area = 0;
    ParentShape(int area){
        this.area = area;
    }
}
class ChildSquare extends ParentShape{
    int side;
    ChildSquare(int area,int side){
        super(area);
        this.side = side;
        this.area = side*side;
    }
}
public class Q4ClassCastException {
    public static void main(String[] args) {
        ParentShape shape = new ParentShape(36);
        try{
            ChildSquare square = (ChildSquare) shape;
        }
        catch(Exception e){
            System.out.println("catch block - The exception is: "+e);
        }
        finally{
            System.out.println("finally block - Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance." +
                    "For example, the following code generates a ClassCastException:\n" +
                    "     Object x = new Integer(0);\n" +
                    "     System.out.println((String)x);\n" +
                    " ");
        }
    }
}

/*
--Before handling:
Exception in thread "main" java.lang.ClassCastException: assignment13.ParentShape cannot be cast to assignment13.ChildSquare
	at assignment13.Q4ClassCastException.main(Q4ClassCastException.java:21)
--After handling:
catch block - The exception is: java.lang.ClassCastException: assignment13.ParentShape cannot be cast to assignment13.ChildSquare
finally block - Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance.For example, the following code generates a ClassCastException:
     Object x = new Integer(0);
     System.out.println((String)x);

Process finished with exit code 0
 */