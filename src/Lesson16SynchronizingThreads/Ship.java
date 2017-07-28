package Lesson16SynchronizingThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 * Created by User on 25.07.2017.
 */
public class Ship extends Thread {
    List<Container> hold;
    private String name;
    private Harbor harbor;
    private Semaphore piersSem;
    Thread t;

    public Ship(String nam, Harbor har, Semaphore sem){
        hold = new ArrayList<>();
        for (int i = 0; i < new Random().nextInt(15) + 1; i++){
            hold.add(new Container());
        }
        name = nam;
        harbor = har;
        piersSem = sem;
        t = new Thread(this, name);
        System.out.println("К порту подошел новый корабль " + name);
//        t.start();
    }

    public void run(){
        try{
            System.out.println("Корабль " + name + " ожидает разрешения на докеровку");
            piersSem.acquire();
            System.out.println("Корабль " + name + " получил разрешение");
            for (int i = 0; i < new Random().nextInt(13); i++){
                disEmbark();
                Thread.sleep(100);
            }
            for (int i = 0; i < new Random().nextInt(13); i++){
                embark();
                Thread.sleep(100);
            }
        } catch (InterruptedException ie){
            System.out.println("Interrupted exception on running");;
        } finally {
            piersSem.release();
            System.out.println("Корабль " + name + " вышел из порта");
        }
    }

    public synchronized void embark (){
        if (harbor.store.storeList.size() > 0 &&
                hold.size() + harbor.store.storeList.get(harbor.store.storeList.size() - 1).getVolume() <= 15){
            hold.add(harbor.store.storeList.remove(harbor.store.storeList.size() - 1));
            System.out.println("В корабль " + name + " загружен контейнер со склада");
        } else System.out.println("Трюм корабля " + name + " полностью загружен");
    }

    public synchronized void disEmbark (){
        if (!(hold.isEmpty()) && harbor.store.storeList.size() < 100){
            hold.remove(hold.size() - 1);
            System.out.println("Из корабля " + name + " на склад выгружен контейнер");
        } else System.out.println("Трюм корабля " + name + " пуст");
    }

}
