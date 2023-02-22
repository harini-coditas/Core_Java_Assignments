package assignment13;

public class Q1Assertion {
    public static void main(String[] args) {
        int x = 13;
        assert x == 19 : "x should be 19";
        System.out.println("end");
    }
}
/*
Assertions in Java are a way to ensure that certain conditions are met during runtime.
An assertion is a statement that checks a boolean expression and throws an AssertionError if the expression is false.
It is often used for debugging and testing purposes.
To use assertions in Java, you can use the assert keyword followed by a boolean expression.
 */
