package Lesson15MultyStream;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by ADMIN on 21.07.2017.
 */
public class Gatherer implements Runnable {
    private JunkYard jy;
    private MadScientist ms;
    public Gatherer(JunkYard jy, MadScientist ms){
        this.jy = jy;
        this.ms = ms;
    }

    public void run(){
        try{
            for(int i =0; i < 99; i++){
                int countDetails = new Random().nextInt(4);
                for(int j = 0; j < countDetails; j++){
                    Part tempPart;
                    if ((tempPart = jy.gatherPart()) != null){
                        ms.details.put(tempPart.getPart(), ms.details.get(tempPart.getPart()) + 1);
                    }
                }
                ms.collectRobots();
                Thread.sleep(100);
            }
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }

    }
}
