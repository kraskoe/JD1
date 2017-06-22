package Lesson6;

/**
 * Created by User on 22.06.2017.
 */
public class Archer extends Hero {
    public Archer(String nam, int dam){
        super(nam, dam);
    }

    public void attackEnemy(Enemy x){
        System.out.println("Archer  " + name + " attacked enemy");
        x.takeDamage(damage);
    }

}
