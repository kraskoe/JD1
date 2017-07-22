package Lesson15MultyStream;

import java.util.Random;

/**
 * Created by ADMIN on 21.07.2017.
 */
public class DetailsFactory extends Thread {
    String name;
    Thread t;
    private JunkYard jy;
    public DetailsFactory(JunkYard jy, String threadName){
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Фабрика деталей приступила к работе");
        this.jy = jy;
        t.start();
    }

    public void run(){
        try{
            for(int i =0; i < 99; i++){
                jy.throwDetails(new Random().nextInt(3)+1);
                sleep(100);
            }
        } catch (InterruptedException ie){
            System.out.println("<--- Поток " + this.name + " прерван! --->");
        }
    }
}
