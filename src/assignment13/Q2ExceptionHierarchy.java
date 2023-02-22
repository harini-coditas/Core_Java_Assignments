package assignment13;

public class Q2ExceptionHierarchy {
    public static void main(String[] args) {
        System.out.println("Exception Hierarchy is described in comments below");
    }
}

/*
Java has almost 40 categories in-built exceptions
Object Class - By default it is parent class of all classes
Throwable is also a subclass of Object Class
-In Java, all exceptions inherit from the Throwable class,
which is the root of the exception hierarchy.
-The Throwable class has two direct subclasses:
Exception and Error.
-Exception is the superclass of all checked exceptions, which are exceptions that must be caught or declared in the method signature.
RuntimeException is a subclass of Exception that represents unchecked exceptions, which are exceptions that do not need to be caught or declared.
-Error is the superclass of all errors, which are exceptions that are usually beyond the control of the program and should not be caught or handled.
Examples of errors include OutOfMemoryError, StackOverflowError, and VirtualMachineError.
 */
