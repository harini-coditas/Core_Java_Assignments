package multithreadingbeginnersbookpractice;

public class MultithreadingDemoUsingRunnable implements Runnable{
    public void run(){
        System.out.println("My thread is in running state.");
    }

    public static void main(String[] args) {
        MultithreadingDemoUsingRunnable obj = new MultithreadingDemoUsingRunnable();
        Thread tobj = new Thread(obj);
        tobj.start();
    }
}

/*
My thread is in running state.
 */