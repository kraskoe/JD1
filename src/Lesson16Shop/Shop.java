package Lesson16Shop;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by User on 29.07.2017.
 */
public class Shop {
    CopyOnWriteArrayList<Good> shopStore;
    public Shop(){
        shopStore = new CopyOnWriteArrayList<>();
        for (Good g : Good.values()){
            for (int i = 0; i < (new Random().nextInt(20)+10); i++){
                shopStore.add(g);
            }
        }
        System.out.println("Товары в магазине:");
        for (Good g : shopStore){
            System.out.print(g.getValue() + " ");
        }
        System.out.println("");
        System.out.println("");
    }
}
