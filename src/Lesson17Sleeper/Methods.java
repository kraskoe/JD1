package Lesson17Sleeper;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

/**
 * Created by ADMIN on 31.07.2017.
 */
public class Methods {
    private static int number;
    static boolean check = true;
    static Semaphore semSup = new Semaphore(1);
    static  Semaphore semCon = new Semaphore(0);
    public synchronized static void put (){
        System.out.println("Введите целое число:");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
    }
    public synchronized static int get(){
        return number;
    }

}
