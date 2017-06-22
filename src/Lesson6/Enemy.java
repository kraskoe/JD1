package Lesson6;

/**
 * Created by User on 22.06.2017.
 */
public class Enemy {
    private int health;

    public Enemy(int h){
        health = h;
    }

    public int getHealthOfTheEnemy(){
        return health;
    }

    public void setHealthOfTheEnemy(int h){
        health = h;
    }

    public void takeDamage(int damage){
        health -= damage;
    }
}
