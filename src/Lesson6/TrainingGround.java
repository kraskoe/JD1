package Lesson6;

/**
 * Created by User on 22.06.2017.
 */
public class TrainingGround {
    public static void main(String[] args) {
        Enemy dummy = new Enemy(75);

        Warrior rufus = new Warrior("Rufus", 5, 80);

        rufus.attackEnemy(dummy);

        Mage hellrain = new Mage("HellRain", 10, 30);

        hellrain.attackEnemy(dummy);

        Archer eagleeye = new Archer("EagleEye", 7, 50);

        eagleeye.attackEnemy(dummy);

        while (dummy.isAlive()){
            rufus.attackEnemy(dummy);
        }

        Enemy zombee = new Enemy();


    }
}
