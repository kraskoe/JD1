package Heroes;

/**
 * Created by User on 25.06.2017.
 */
public class Warrior extends Hero {

    public Warrior (String nam, double hlth, int arm, int parm, int res, double dam, double pDam, double mDam){
        super(nam, hlth, arm, parm, res, dam, pDam, mDam);
    }

    public void attackEnemy(Enemy enemy){
        System.out.println(this.getName() + " attacked " + enemy.getName());
        enemy.takeDamage(this);
    }

//    don't forget to use damageMultiplier!!!
    public void takeDamage(Enemy enemy){
        double tempDamage = (enemy.getDamage() - this.getArmor()) - (enemy.getPiercingDamage() - this.getPiercingArmor())
                - (enemy.getMagicalDamage() - this.getResistance());
        double tempHealth = this.getHealth() - tempDamage;
        if (tempHealth < 0){
            tempHealth = 0;
        }

        this.setHealth(tempHealth);

        System.out.println(enemy.getName() + " wounded " + this.getName() + " for " + tempDamage + " hitpoints.");
        System.out.println("Current " + this.getName() + " health = " + this.getHealth() + " hp");

    }

}
