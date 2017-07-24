package Lesson15MultyStream;

/**
 * Created by ADMIN on 21.07.2017.
 */
public class Lesson15JunkYard {
    public static void main(String[] args) {
        MadScientist madScientist1 = new MadScientist("Безумный ученый 1");
        MadScientist madScientist2 = new MadScientist("Безумный ученый 2");
        JunkYard myJunkYard = new JunkYard();

        Gatherer gatherer1 = new Gatherer(myJunkYard, madScientist1, "Сборщик 1");
        Gatherer gatherer2 = new Gatherer(myJunkYard, madScientist2, "Сборщик 2");
        DetailsFactory myDetailsFactory = new DetailsFactory(myJunkYard, "Фабрика");

        try {
            gatherer1.t.join();
            gatherer2.t.join();
            myDetailsFactory.t.join();
        } catch (InterruptedException ie) {
            System.out.println("<--- Главный поток прерван! --->");
        }

        System.out.println("------------------------------------");
        System.out.println(madScientist1.getName() + " собрал " + madScientist1.getRobotsReady() + " роботов");
        System.out.println(madScientist2.getName() + " собрал " + madScientist2.getRobotsReady() + " роботов");
    }
}
