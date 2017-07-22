package Lesson15MultyStream;

import java.util.Random;

/**
 * Created by ADMIN on 21.07.2017.
 */
public class Gatherer implements Runnable {
    private JunkYard jy;
    private MadScientist ms;
    String name;
    Thread t;
    public Gatherer(JunkYard jy, MadScientist ms, String threadName){
        this.jy = jy;
        this.ms = ms;
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Сборщик " + t.getName() + " вышел на работу");
        t.start();
    }

    public void run(){
        try{
            for(int i =0; i < 99; i++){
                int countDetails = new Random().nextInt(4);
                for(int j = 0; j < countDetails; j++){
                    PartFactory tempPartFactory;
                    if ((tempPartFactory = jy.gatherPart()) != null){
                        ms.details.put(tempPartFactory.getPart(), ms.details.get(tempPartFactory.getPart()) + 1);
                        System.out.println("--- " + this.name + " поднял деталь ---");
                    }
                }
                ms.collectRobots();
                Thread.sleep(101);
            }
        } catch (InterruptedException ie){
            System.out.println("<--- Поток " + this.name + " прерван! --->");
        }
    }
}
