package Lesson17Array;


import java.util.Random;
import java.util.concurrent.CountDownLatch;

/**
 * Created by ADMIN on 31.07.2017.
 */
public class Lesson17ArrayMain {
    public static void main(String[] args) {
        int[] integerArray = new int[10000000];
        int numberOfThreads = 10;
        CountDownLatch cdl = new CountDownLatch(numberOfThreads);
        for (int i = 0; i < integerArray.length; i++) {
            integerArray[i] = new Random().nextInt(300) + 1;
        }
        int tempMaxValue = integerArray[0];
        int tempMultiStreamValue = integerArray[0];

        long start1 = System.currentTimeMillis();
        for (int i = 0 + 1; i < integerArray.length; i++) {
            if (tempMaxValue < integerArray[i]) {
                tempMaxValue = integerArray[i];
            }
        }
        long finish1 = System.currentTimeMillis();
        System.out.printf("Time of finding max using one stream: %d milliseconds%n", finish1 - start1);
        System.out.println("Maximum value is: " + tempMaxValue);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < numberOfThreads; i++) {
            new ArrayAnalizer(i * integerArray.length / numberOfThreads,
                    (i + 1) * integerArray.length / numberOfThreads,
                    integerArray,
                    cdl);
        }

        try {
            cdl.await();
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }

        for (Object i : TempArray.valuesMap.values()) {
            if (tempMultiStreamValue < (int) i) {
                tempMultiStreamValue = (int) i;
            }
        }
        long finish2 = System.currentTimeMillis();
        System.out.printf("Time of finding max using %d streams: %d milliseconds%n", numberOfThreads, finish2 - start2);
        System.out.println("Maximum value is: " + tempMultiStreamValue);
    }
}
