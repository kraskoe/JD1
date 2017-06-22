package Lesson6;

/**
 * Created by User on 22.06.2017.
 */
public class Warrior extends Hero {
    public Warrior(String nam, int dam){
        super(nam, dam);
    }

    public void attackEnemy(Enemy x){
        System.out.println("Warrior " + name + " attacked enemy");
        x.takeDamage(damage);
    }

}
