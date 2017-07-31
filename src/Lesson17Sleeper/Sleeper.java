package Lesson17Sleeper;

import java.lang.reflect.Method;

/**
 * Created by ADMIN on 31.07.2017.
 */
public class Sleeper extends Thread {

    public void run() {
        System.out.println("Sleeper приступил к работе");

        try {
            while (Methods.check) {
                Methods.semCon.acquire();
                if (Methods.get() == -1) break;
                sleep(Methods.get());
                System.out.println("Я спал " + (double) Methods.get() / 1000 + " секунд");
                Methods.semSup.release();
            }
        } catch (InterruptedException ie) {
            System.out.println("!Interrupted exception in Sleeper.run()!");
        }
    }
}
