package Lesson6;

/**
 * Created by User on 22.06.2017.
 */
public class Archer extends Hero {
    public Archer(String nam, int dam, int hlth) {
        super(nam, dam, hlth);
    }

    public void attackEnemy(Enemy x) {
        System.out.println("Archer  " + getHeroName() + " attacked enemy");
        x.takeDamage(getHeroDamage());
    }

}
