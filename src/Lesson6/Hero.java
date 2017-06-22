package Lesson6;

/**
 * Created by User on 22.06.2017.
 */
public class Hero {
    protected String name;
    protected int damage;

    public Hero(String nam, int dam){
        name = nam;
        damage = dam;
    }

    public String getHeroName(){
        return name;
    }

    public void attackEnemy(Enemy x){
        System.out.println("Hero " + name + " attacked enemy");
        x.takeDamage(damage);
    }
}
