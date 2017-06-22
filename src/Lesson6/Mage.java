package Lesson6;

/**
 * Created by User on 22.06.2017.
 */
public class Mage extends Hero {
    public Mage(String nam, int dam){
        super(nam, dam);
    }

    public void attackEnemy(Enemy x){
        System.out.println("Mage " + name + " attacked enemy");
        x.takeDamage(damage);
    }

}
