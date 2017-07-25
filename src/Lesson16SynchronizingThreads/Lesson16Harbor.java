package Lesson16SynchronizingThreads;

import java.util.concurrent.*;

/**
 * Created by User on 25.07.2017.
 */
public class Lesson16Harbor {
    public static void main(String[] args) {
        Harbor myHarbor = new Harbor();
        Semaphore harborSemaphore = new Semaphore(myHarbor.getPiersNum());
//        SheduledExecutorService shipSupplier = Executors.newSingleThreadScheduledExecutor();
//        shipSupplier.shedule
    }
}
