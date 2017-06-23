package Lesson6;

/**
 * Created by User on 22.06.2017.
 */
public abstract class Hero implements Mortal {
    private String name;
    private int damage, health;

    public Hero(String nam, int dam, int hlth){
        name = nam;
        damage = dam;
        health = hlth;
    }

    public int getHeroDamage(){
        return damage;
    }

    public int getHeroHealth(){
        return health;
    }

    public String getHeroName(){
        return name;
    }

    public void takeDamage(int damage){
        health -= damage;
        System.out.println("Current " + getHeroName() + " health: " + getHeroHealth());
    }

    public boolean isAlive(){
        if (health > 0){
            return true;
        } else return  false;
    }

    public abstract void attackEnemy(Enemy x);
}
