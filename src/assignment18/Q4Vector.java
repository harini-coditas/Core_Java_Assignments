package assignment18;

import java.util.Enumeration;
import java.util.Vector;

public class Q4Vector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(23);
        vector.add(43);
        vector.add(13);
        vector.add(33);
        vector.add(55);

        Enumeration e = vector.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        vector.addElement(23); //in vector the addElement adds the obj/element at end
        System.out.println("first element: "+vector.firstElement());
        System.out.println(vector);
        System.out.println("last element: "+vector.lastElement());

    }
}
