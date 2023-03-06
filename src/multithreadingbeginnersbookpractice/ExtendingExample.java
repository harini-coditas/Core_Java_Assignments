package multithreadingbeginnersbookpractice;
class Count extends Thread{
  Count(){
      super("my extending thread");
      System.out.println("My thread created: "+this);
      start();
  }
  public void run(){

         try {
             for (int i = 0; i < 10; i++) {
                 System.out.println("Printing the count " + i);
                 Thread.sleep(1000);
             }
         }catch (InterruptedException e) {
             //throw new RuntimeException(e);
             System.out.println("my thread interrupted");
         }
      System.out.println("My thread run is over");
     }
  }
public class ExtendingExample {
    public static void main(String[] args) {
        Count count = new Count();
        try {
                while(count.isAlive()) {
                   System.out.println("Main thread will be alive till the child thread is live");
                   Thread.sleep(1500);
                }
            } catch (InterruptedException e) {
               // throw new RuntimeException(e);
            System.out.println("Main thread interrupted");
            }
        System.out.println("Main thread's run is over");

    }
}
/*
My thread created: Thread[my extending thread,5,main]
Main thread will be alive till the child thread is live
Printing the count 0
Printing the count 1
Main thread will be alive till the child thread is live
Printing the count 2
Main thread will be alive till the child thread is live
Printing the count 3
Printing the count 4
Main thread will be alive till the child thread is live
Printing the count 5
Main thread will be alive till the child thread is live
Printing the count 6
Printing the count 7
Main thread will be alive till the child thread is live
Printing the count 8
Main thread will be alive till the child thread is live
Printing the count 9
My thread run is over
Main thread's run is over
 */