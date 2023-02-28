package assignment15;

class RestartTest extends Thread{
    @Override
    public void run() {
        System.out.println("run method of RestartTest class");
    }
}
public class Q1CanWeRestartThread {
    public static void main(String[] args) {
        RestartTest restartTest = new RestartTest();
        restartTest.start();
        restartTest.start();
    }
}
/*
run method of RestartTest class
Exception in thread "main" java.lang.IllegalThreadStateException
	at java.lang.Thread.start(Thread.java:708)
	at assignment15.Q1CanWeRestartThread.main(Q1CanWeRestartThread.java:13)

 */
/*
        So, we cannot restart a thread as once the execution of thread /task is done
        the threads dies so,we cannot reuse it
        */
