package Lesson15MultyStream;

/**
 * Created by ADMIN on 21.07.2017.
 */
public class Lesson15JunkYard {
    public static void main(String[] args) {
        MadScientist madScientist1 = new MadScientist();
        MadScientist madScientist2 = new MadScientist();
        JunkYard myJunkYard = new JunkYard();

        Gatherer gatherer1 = new Gatherer(myJunkYard, madScientist1);
        Gatherer gatherer2 = new Gatherer(myJunkYard, madScientist2);
        DetailsFactory myDetailsFactory = new DetailsFactory(myJunkYard);
        new Thread(gatherer1).start();
        new Thread(gatherer2).start();
        new Thread(myDetailsFactory).start();

        System.out.println(madScientist1.getRobotsReady());
        System.out.println(madScientist2.getRobotsReady());
    }
}
