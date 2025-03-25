package using_join;

public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread is starting");

        MyThread myThread1 = MyThread.createAndStart("Child #1");
        MyThread myThread2 = MyThread.createAndStart("Child #2");
        MyThread myThread3 = MyThread.createAndStart("Child #3");

        try {
            myThread1.thread.join();
            System.out.println("Child #1 joined.");
            myThread2.thread.join();
            System.out.println("Child #2 joined.");
            myThread3.thread.join();
            System.out.println("Child #3 joined.");
        }catch (InterruptedException exception){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread terminating.");
    }
}
