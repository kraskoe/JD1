package Heroes;

/**
 * Created by User on 25.06.2017.
 */
public class Warrior extends Hero {

    public Warrior(String nam, double hlth, double arm, double parm, double res, double dam, double pDam, double mDam) {
        super(nam, hlth, arm, parm, res, dam, pDam, mDam);
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println(this.getName() + " attacked " + enemy.getName());

        if (crushingBlow()) {
            damageMultiplier = 1.5;
            System.out.println(this.getName() + " used crushing blow skill");
        }

        enemy.takeDamage(this);
        damageMultiplier = 1;

        if (applyMoralBuff()) {
            System.out.println("Due to high morale " + this.getName() + " attacks again!");
            enemy.takeDamage(this);
        }
    }

    public void takeDamage(Enemy enemy) {
        double tempDamage = (enemy.getDamage() * this.getArmor()) + (enemy.getPiercingDamage() * this.getPiercingArmor())
                + (enemy.getMagicalDamage() * this.getResistance());
        double tempHealth = this.getHealth() - tempDamage;

        if (tempHealth < 0) {
            tempHealth = 0;
        }

        this.setHealth(tempHealth);

        System.out.println(enemy.getName() + " wounded " + this.getName() + " for " + tempDamage + " hitpoints.");

        if (isAlive()) {
            System.out.println("Current " + this.getName() + " health = " + this.getHealth() + " hp");
        } else System.out.println(this.getName() + " died");
    }

    public boolean crushingBlow() {
        if (Math.random() <= 0.25) {
            return true;
        } else return false;
    }

    public boolean isAlive() {
        if (this.getHealth() > 0) {
            return true;
        } else return false;
    }
}
