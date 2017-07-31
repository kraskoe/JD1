package Lesson17Sleeper;

/**
 * Created by ADMIN on 31.07.2017.
 */
public class Lesson17SleeperMain {
    public static void main(String[] args) {
        Thread t = new Sleeper();
        t.start();
        try {
            while (Methods.check) {
                Methods.semSup.acquire();
                Methods.put();
                if (Methods.get() == -1) {
                    Methods.check = false;
                }
                Methods.semCon.release();
            }
        } catch (InterruptedException ie) {
            System.out.println("!Interrupted exception in main thread join()!");
        }
        try {
            t.join();
        } catch (InterruptedException ie) {
            System.out.println("!Interrupted exception in main thread join()!");
        }
        System.out.println("Программа завершила работу");
    }
}
