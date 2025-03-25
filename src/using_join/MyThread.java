package using_join;
// Using method join() to wait for the thread to finish
public class MyThread implements Runnable{
    Thread thread;

    //Constructor of MyThread
    MyThread(String name){
        thread = new Thread(this, name);
    }

    //Factory method to create and start a thread
    public static MyThread createAndStart(String name){
        MyThread myThread = new MyThread(name);
        myThread.thread.start(); // Start the thread
        return myThread;
    }

    // Entry point of the thread
    public void run(){
        System.out.println("Thread " + thread.getName() + " starting.");
        try{
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thread.getName() + ", count is " + count);
            }
        }catch (InterruptedException exception){
            System.out.println("Thread " + thread.getName() + " interrupted.");
        }
        System.out.println("Thread " + thread.getName() + " terminating.");
    }
}
