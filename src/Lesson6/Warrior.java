package Lesson6;

/**
 * Created by User on 22.06.2017.
 */
public class Warrior extends Hero {
    public Warrior(String nam, int dam, int hlth){
        super(nam, dam, hlth);
    }

    public void attackEnemy(Enemy x){
        System.out.println("Warrior " + getHeroName() + " attacked enemy");
        x.takeDamage(getHeroDamage());
    }

}
