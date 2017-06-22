package Lesson6;

/**
 * Created by User on 22.06.2017.
 */
public class TrainingGround {
    public static void main(String[] args) {
        Enemy myEnemy = new Enemy(75);

        Hero avalon = new Hero("Avalon", 7);

        System.out.println(avalon.getHeroName());

        avalon.attackEnemy(myEnemy);

        Warrior rufus = new Warrior("Rufus", 5);

        rufus.attackEnemy(myEnemy);

        Mage hellrain = new Mage("HellRain", 10);

        hellrain.attackEnemy(myEnemy);

        Archer eagleeye = new Archer("EagleEye", 7);

        eagleeye.attackEnemy(myEnemy);

    }
}
