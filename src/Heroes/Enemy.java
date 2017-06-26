package Heroes;

/**
 * Created by User on 25.06.2017.
 */
public abstract class Enemy extends Personage {
    private double damage, piercingDamage, magicalDamage;

    public Enemy (String nam, double hlth, double arm, double parm, double res, double dam, double pDam, double mDam){
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

    public abstract void attackEnemy(Hero hero);

    public abstract void takeDamage(Hero hero);
}
