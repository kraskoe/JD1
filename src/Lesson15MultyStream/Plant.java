package Lesson15MultyStream;

import java.util.Random;

/**
 * Created by ADMIN on 21.07.2017.
 */
public class Plant extends Thread {
    private JunkYard jy;
    public Plant(JunkYard jy){
        this.jy = jy;
    }

    public void run(){
        try{
            for(int i =0; i < 99; i++){
                jy.throwDetails(new Random().nextInt(4));
                sleep(100);
            }
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
