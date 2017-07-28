package Lesson16SynchronizingThreads;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadFactory;

/**
 * Created by ADMIN on 28.07.2017.
 */
public class ShipFactory {
    static int counter = 1;
    Harbor har;
    Semaphore sem;
    public Thread newThread(Harbor har, Semaphore sem){
        return new Ship("Ship " + counter, har, sem);
    }
}
