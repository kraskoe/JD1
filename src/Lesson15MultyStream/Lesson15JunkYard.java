package Lesson15MultyStream;

/**
 * Created by ADMIN on 21.07.2017.
 */
public class Lesson15JunkYard {
    public static void main(String[] args) {
        MadScientist madScientist1 = new MadScientist();
        MadScientist madScientist2 = new MadScientist();
        JunkYard myJunkYard = new JunkYard();
        for (int i = 0; i < myJunkYard.junkParts.size(); i++){
            System.out.println(myJunkYard.junkParts.pop());
        }

//        Gatherer gatherer1 = new Gatherer(myJunkYard, madScientist1);
//        Gatherer gatherer2 = new Gatherer(myJunkYard, madScientist2);
//        Plant myPlant = new Plant(myJunkYard);
//        new Thread(gatherer1).start();
//        new Thread(gatherer2).start();
//        new Thread(myPlant).start();
//
//        System.out.println(madScientist1.getRobotsReady());
//        System.out.println(madScientist2.getRobotsReady());
    }
}
