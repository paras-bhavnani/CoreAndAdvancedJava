class HeavyWorkRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" STARTED ");
        try {
            Thread.sleep(10000);
            //Get database connection, delete unused data from DB
            //doDBProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" COMPLETED ");
    }

    /* private void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
    } */

}
class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" STARTED ");
        try {
            Thread.sleep(5000);
            //Get database connection, delete unused data from DB
            //doDBProcessing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" COMPLETED ");
        Thread t1 = new Thread(new HeavyWorkRunnable(), "processData");
        System.out.println("Starting Runnable threads");
        t1.start();
        System.out.println("Runnable Threads has been started");
    }

    /* private void doDBProcessing() throws InterruptedException {
        Thread.sleep(5000);
    } */
    
}

public class ThreadRun {

    public static void main(String[] args){
        /* Thread t1 = new Thread(new HeavyWorkRunnable(), "t1");
        System.out.println("Starting Runnable threads");
        t1.start();
        System.out.println("Runnable Threads has been started"); */
        Thread t3 = new MyThread("Fetch Data");
        System.out.println("Starting extends Thread type");
        t3.start();
        System.out.println("Extends Thread has been started");
        
    }
}