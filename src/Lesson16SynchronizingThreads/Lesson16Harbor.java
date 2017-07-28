package Lesson16SynchronizingThreads;

import java.util.concurrent.*;

/**
 * Created by User on 25.07.2017.
 */
public class Lesson16Harbor {
    public static void main(String[] args) {
        Harbor myHarbor = new Harbor();
        Semaphore harborSemaphore = new Semaphore(myHarbor.getPiersNum());

//        try {
//            for (int i = 1; i < 11; i++){
//                new Ship("Ship " + i, myHarbor, harborSemaphore).start();
//                Thread.sleep(100);
//            }
//        } catch (InterruptedException ie) {
//            System.out.println("!!!Interrupted exception!!!");
//        }


        ExecutorService shipSupplier = Executors.newCachedThreadPool();
        try {
            for (int i = 1; i < 11; i++){
                shipSupplier.execute(new Ship("Ship " + i, myHarbor, harborSemaphore));
                Thread.sleep(100);
            }
        } catch (InterruptedException ie){
            System.out.println("!!!Interrupted exception!!!");
        } finally {
            shipSupplier.shutdown();
        }
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException ie) {
//            ie.printStackTrace();
//        }
        while (!(shipSupplier.isTerminated())){}
        System.out.println("Рабочий день закончен");

//        ScheduledExecutorService shipSupplier = Executors.newScheduledThreadPool(15, (ThreadFactory) ShipFactory.newThread(myHarbor, harborSemaphore));
//        shipSupplier.scheduleAtFixedRate(new Ship("Ship", myHarbor, harborSemaphore), 0, 3000, TimeUnit.MILLISECONDS);
//        shipSupplier.shutdown();

    }
}
