package Lesson6;

/**
 * Created by User on 22.06.2017.
 */
public class Enemy implements Mortal {
    private String name;
    private int damage, health;

    public Enemy(int h) {
        health = h;
    }

    public int getHealthOfTheEnemy() {
        if (health >= 0) {
            return health;
        } else return 0;
    }

    public String getEnemyName() {
        return name;
    }

    public int getEnemyDamage() {
        return damage;
    }

    public void setHealthOfTheEnemy(int h) {
        health = h;
    }

    public void attackHero(Hero x) {
        System.out.println("Enemy  " + getEnemyName() + " attacked hero");
        x.takeDamage(getEnemyDamage());
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("Current enemy health: " + getHealthOfTheEnemy());
    }

    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else return false;
    }
}
