package Lesson16SynchronizingThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by User on 25.07.2017.
 */
public class Store {
    List<Container> storeList;
    private int capacity;
    public Store(int cap){
        capacity = cap;
        storeList = new ArrayList<>();
        for (int i = 0; i < cap; i++){
            storeList.add(new Container());
        }
    }

    public int getCapacity(){
        return capacity;
    }
}
