package Lesson17Array;

import java.util.Arrays;

/**
 * Created by ADMIN on 31.07.2017.
 */
public class ArrayAnalizer extends Thread {
    int beginning, end;
    int[] intArray;
    int tempValue, tempID;
    Thread t;
    public ArrayAnalizer(int beg, int e, int[] intArr){
        beginning = beg;
        end = e;
        intArray = intArr;
        tempID = beg;
        tempValue = intArray[beg];
        t = this;
        t.start();
    }
    public void run(){
        for (int i = beginning + 1; i < end; i++){
            if(tempValue < intArray[i]){
                tempValue = intArray[i];
                tempID = i;
            }
        }
        TempArray.valuesMap.put(tempID, tempValue);
    }
}
