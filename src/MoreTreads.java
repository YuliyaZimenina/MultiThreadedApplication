public class MoreTreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting");
        // Create and start a threads
        MyThread myThread1 = MyThread.createAndStart("Child #1");
        MyThread myThread2 = MyThread.createAndStart("Child #2");
        MyThread myThread3 = MyThread.createAndStart("Child #3");

        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }catch (InterruptedException exception){
                System.out.println("Main thread was interrupted");
            }
        }while (myThread1.thread.isAlive()||
        myThread2.thread.isAlive() ||
        myThread3.thread.isAlive());
        System.out.println("Main thread ending");
    }
}