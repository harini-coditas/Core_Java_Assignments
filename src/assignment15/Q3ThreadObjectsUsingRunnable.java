package assignment15;

class TestThreadObjects implements Runnable{
    public void run(){
        System.out.println("run method");
        System.out.println("Current thread is: "+Thread.currentThread());
    }
}
public class Q3ThreadObjectsUsingRunnable {
    public static void main(String[] args) {
        TestThreadObjects test1 = new TestThreadObjects();
        Thread thread1 = new Thread(test1);

        TestThreadObjects test2 = new TestThreadObjects();
        Thread thread2 = new Thread(test2);

        TestThreadObjects test3 = new TestThreadObjects();
        Thread thread3 = new Thread(test3);

        System.out.println("Is thread1 daemon: "+thread1.isDaemon());
        thread1.setName("FirstThread");
        thread2.setName("SecondThread");
        thread3.setName("ThirdThread");
        System.out.println("thread1 name: "+thread1.getName());
        System.out.println("thread2 name: "+thread2.getName());
        System.out.println("thread3 name: "+thread3.getName());
        thread3.start();
        System.out.println("Is thread1 alive: "+thread1.isAlive());
        thread2.setDaemon(true);
        System.out.println("Is thread2 daemon: "+thread2.isDaemon());
        System.out.println("State of thread1: "+thread1.getState());
        System.out.println("State of thread2: "+thread2.getState());
        System.out.println("State of thread3: "+thread3.getState());
        thread1.setPriority(1);
        thread2.setPriority(3);
        thread3.setPriority(10);
        thread1.start();
        thread2.start();
        System.out.println("Priority of thread1: "+thread1.getPriority());
        System.out.println("Thread1 id is: "+thread1.getId());
        System.out.println("ThreadGroup of thread1: "+thread1.getThreadGroup());
        try {
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread1.join(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

/*
Is thread1 daemon: false
thread1 name: FirstThread
thread2 name: SecondThread
thread3 name: ThirdThread
Is thread1 alive: false
Is thread2 daemon: true
run method
State of thread1: NEW
State of thread2: NEW
State of thread3: RUNNABLE
Current thread is: Thread[ThirdThread,5,main]
Priority of thread1: 1
Thread1 id is: 11
ThreadGroup of thread1: java.lang.ThreadGroup[name=main,maxpri=10]
run method
run method
Current thread is: Thread[SecondThread,3,main]
Current thread is: Thread[FirstThread,1,main]

 */