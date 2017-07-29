package Lesson16Shop;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by User on 29.07.2017.
 */
public class Customer extends Thread {
    private String name;
    private int cash;
    ShoppingBasket cBusket;
    Shop shop;
    Thread t;
    Semaphore freeCasse;
    ReentrantLock locker;
    private Good tempGood;
    private int tempCash, randomItemID;

    public Customer(String n, Shop s, Semaphore sem, ReentrantLock lock){
        name = n;
        cBusket = new ShoppingBasket();
        shop = s;
        cash = new Random().nextInt(500);
        tempCash = cash;
        freeCasse = sem;
        locker = lock;
        t = new Thread(this, name);
        t.start();
    }

    public void run(){
        System.out.println("Покупатель " + name + " вошел в магазин");
        doShopping();
        if (cBusket.basket.isEmpty()){
            System.out.println("Покупатель " + name + " не выбрал ни одного товара");
            System.out.println("Покупатель " + name + " вышел из магазина");
        } else {
            try {
                freeCasse.acquire();
                System.out.println("                                                     <<<Покупатель " + name + " подошел к кассе");
                serve();
                freeCasse.release();
            } catch (InterruptedException ie){
                System.out.println("!!!Interrupted exception!!!");
            }
        }
    }

    public void doShopping(){
        try{
            for (int i = 0; i < new Random().nextInt(15); i++){
                locker.lock();
                if (!(shop.shopStore.isEmpty())){
                    randomItemID = new Random().nextInt(shop.shopStore.size());
                    if ((tempCash -= shop.shopStore.get(randomItemID).getPrice()) > 0){
                        tempGood = shop.shopStore.get(randomItemID);
                        cBusket.basket.add(shop.shopStore.remove(randomItemID));
                        System.out.println("Покупатель " + name + " положил в корзину товар: " + tempGood.getValue());
                    } else System.out.println("У покупателя " + name + " не хватает денег на желаемый товар");
                } else System.out.println("Все товары проданы!");
                locker.unlock();
                sleep(400);
            }
        } catch (InterruptedException ie){
            System.out.println("!!!Interrupted exception!!!");
        }
    }

    public int getCash(){
        return cash;
    }
    public void setCash(int c){
        cash = c;
    }

    public void serve(){
        int totalSum = 0;
        if (!(this.cBusket.basket.isEmpty())){
            for (Good g : this.cBusket.basket){
                totalSum += g.getPrice();
            }
        }
        cash = cash - totalSum;
        System.out.printf("                                                     Общая стоимость товаров в корзине покупателя " + name + ": " + totalSum +"%n"
                + "                                                     Покупатель " + name + " оплатил товар%n"
                + "                                                     У покупателя " + name + " осталось денег: " + cash + "%n"
                + "                                                     Покупатель " + name + " вышел из магазина>>>%n");
    }
}
