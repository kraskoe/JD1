package Lesson16Shop;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by User on 29.07.2017.
 */
public class Lesson16ShopMainClass {
    public static void main(String[] args) {
        Shop myShop = new Shop();
        Semaphore casses = new Semaphore(3);
        ReentrantLock shopLock = new ReentrantLock();
        try {
            for (int i = 1; i < 21; i++){
                new Customer("Покупашка " + i, myShop, casses, shopLock);
                Thread.sleep(new Random().nextInt(1000));
            }
        } catch (InterruptedException ie){
            System.out.println("!!!Interrupted exception!!!");
        }
    }
}
