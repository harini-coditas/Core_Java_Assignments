package multithreadingbeginnersbookpractice;

class CountNew implements Runnable{

    Thread mythread ;
    CountNew(){
        mythread = new Thread(this, "my runnable thread");
        System.out.println("my thread created: "+mythread);
        mythread.start();
    }

    @Override
    public void run() {
        try{
            for(int i=0;i<10;i++){
                System.out.println("Printing the count: "+i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }
}
public class RunnableExample {
    public static void main(String[] args) {
        CountNew countNew = new CountNew();
        try{
            while(countNew.mythread.isAlive()){
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over");
    }
}
/*
my thread created: Thread[my runnable thread,5,main]
Main thread will be alive till the child thread is live
Printing the count: 0
Printing the count: 1
Main thread will be alive till the child thread is live
Printing the count: 2
Main thread will be alive till the child thread is live
Printing the count: 3
Printing the count: 4
Main thread will be alive till the child thread is live
Printing the count: 5
Main thread will be alive till the child thread is live
Printing the count: 6
Printing the count: 7
Main thread will be alive till the child thread is live
Printing the count: 8
Main thread will be alive till the child thread is live
Printing the count: 9
my thread run is over
Main thread run is over

 */
