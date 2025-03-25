package multi_thread;

public class MyThread implements Runnable{
    Thread thread;

    // Constructor to create a new thread
    MyThread (String name){
        thread = new Thread(this, name);
    }

    //Fabric method to create and start a thread
    public static MyThread createAndStart(String name){
        MyThread myThread = new MyThread(name);
        myThread.thread.start(); // Start the thread
        return myThread;
    }

    // Entry point of the thread
    public void run(){
        System.out.println("Thread " + thread.getName() + " is running");
        try{
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thread.getName() + ", count is " + count);
            }
        }catch (InterruptedException exception){
            System.out.println(thread.getName() + " was interrupted");
        }
        System.out.println(thread.getName() + " is exiting");
    }
}
