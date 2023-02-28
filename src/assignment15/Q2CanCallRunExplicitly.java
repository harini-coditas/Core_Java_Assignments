package assignment15;

class TestRun extends Thread{
    public void run(){
        System.out.println("run me");
    }

}
public class Q2CanCallRunExplicitly {
    public static void main(String[] args) {
        TestRun testRun = new TestRun();
        //testRun.start();
        testRun.run();
    }
}
/*
run me
 */

/*
We can call run method explicitly,(but it will not create a thread) but the thread will not be
created if you don't use start method..as all steps including start method
calling should be done for creating a thread

If you call the run() method explicitly on a Java thread, it will execute the code inside the run() method
 just like any other method call. However, the thread will not actually run as a separate thread of execution.
 Instead, it will run on the same thread that called the run() method, which is usually the main thread of the program.

In other words, calling run() on a Java thread does not start a new thread of execution.
It simply executes the code inside the run() method on the current thread.
This can be useful in certain situations where you want to execute the code in a thread synchronously,
or if you want to test the code inside the run() method without creating a separate thread.
However, it is important to note that calling run() instead of start() on a Java thread will not
 provide the benefits of multi-threading, such as concurrent execution and improved performance.
 */
