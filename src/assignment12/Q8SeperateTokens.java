package assignment12;

import java.util.ArrayList;
import java.util.*;

class OperandsOperators{
    public void display(){
        ArrayList<String> operators = new ArrayList<>();
        ArrayList<String> operands = new ArrayList<>();
        StringTokenizer str = new StringTokenizer("3+(20%2)*(20/2)","[+%-/*]",true);
        int i = 0;
        while(str.hasMoreTokens()) {
            if (i % 2 == 0) {
                operands.add(str.nextToken());
            } else {
                operators.add(str.nextToken());
            }
            i++;

        }
            System.out.println("The operators in given string are :"+operators);
            System.out.println("The operands in given string are :"+operands);

    }
}
public class Q8SeperateTokens {
    public static void main(String[] args) {
        OperandsOperators operandsOperators = new OperandsOperators();
        operandsOperators.display();
    }
}

/*
The operators in given string are :[+, %, *, /]
The operands in given string are :[3, (20, 2), (20, 2)]

 */