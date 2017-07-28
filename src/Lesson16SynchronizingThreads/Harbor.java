package Lesson16SynchronizingThreads;

import java.util.Random;

/**
 * Created by User on 25.07.2017.
 */
public class Harbor {
    private int piersNum;
    Store store;

    public Harbor(int pn){
        piersNum = pn;
        store = new Store(100);
    }
    public Harbor(){
        this(new Random().nextInt(7) + 3);
    }
    public int getPiersNum(){
        return piersNum;
    }
}
