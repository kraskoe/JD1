package Heroes;

/**
 * Created by User on 24.06.2017.
 */
public class TrainingGround {
    public static void main(String[] args) {
        Warrior war1 = new Warrior("Rufus", 90, 0.6, 0.8, 0.9, 5, 0, 0);

        Zombie zmb1 = new Zombie("Dumb zombie", 80, 0.9, 0.8, 0.6, 7, 0, 0);

        while (war1.isAlive() && zmb1.isAlive()){
            war1.attackEnemy(zmb1);
            zmb1.attackEnemy(war1);
        }

    }
}
