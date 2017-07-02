package Heroes;

/**
 * Created by User on 25.06.2017.
 */
public class Zombie extends Enemy implements Immortal {
    private int resurrectionQuantity = 1;

    public Zombie(String nam, double hlth, double arm, double parm, double res, double dam, double pDam, double mDam) {
        super(nam, hlth, arm, parm, res, dam, pDam, mDam);
    }

    private double fullHealth = getHealth();

    public void attackEnemy(Hero hero) {
        System.out.println(this.getName() + " attacked " + hero.getName());

        hero.takeDamage(this);

    }

    public void takeDamage(Hero hero) {
        double tempDamage = hero.damageMultiplier * (hero.getDamage() * this.getArmor()) + (hero.getPiercingDamage() * this.getPiercingArmor())
                + (hero.getMagicalDamage() * this.getResistance());
        double tempHealth = this.getHealth() - tempDamage;

        if (tempHealth < 0) {
            tempHealth = 0;
        }

        this.setHealth(tempHealth);

        System.out.println(hero.getName() + " wounded " + this.getName() + " for " + tempDamage + " hitpoints.");

        if (isAlive()) {
            System.out.println("Current " + this.getName() + " health = " + this.getHealth() + " hp");
        } else {
            if (canResurrect()) {
                this.setHealth(fullHealth);
                System.out.println(this.getName() + " died, but resurrected. Current " + this.getName() + " health = " + this.getHealth() + " hp");
            } else System.out.println(this.getName() + " died");
        }

    }

    public boolean canResurrect() {
        if (resurrectionQuantity > 0) {
            resurrectionQuantity--;
            return true;
        } else return false;
    }
}
