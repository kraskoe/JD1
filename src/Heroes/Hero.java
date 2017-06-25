package Heroes;

/**
 * Created by User on 25.06.2017.
 */
public abstract class Hero extends Personage implements Human {
    private double damage, piercingDamage, magicalDamage, damageMultiplier;

    public Hero (String nam, double hlth, int arm, int parm, int res, double dam, double pDam, double mDam){
        super(nam, hlth, arm, parm, res);
        damage = dam;
        piercingDamage = pDam;
        magicalDamage = mDam;
    }

    public double getDamage(){
        return damage;
    }

    public double getPiercingDamage(){
        return piercingDamage;
    }

    public double getMagicalDamage(){
        return magicalDamage;
    }

    public void setDamage(double dam){
        damage = dam;
    }

    public void setPiercingDamage(double pDam){
        piercingDamage = pDam;
    }

    public void setMagicalDamage(double mDam){
        magicalDamage = mDam;
    }

    public abstract void attackEnemy(Enemy enemy);
    public abstract void takeDamage(Enemy enemy);

    public void applyMoralBuff(){
        if (Math.random() > 0.75){
            damageMultiplier = 1.5;
        }
    }
}
