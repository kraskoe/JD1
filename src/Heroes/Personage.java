package Heroes;

/**
 * Created by User on 24.06.2017.
 */
public abstract class Personage implements Mortal{
    private String name;
    private double health;
    private double armor, piercingArmor, resistance;

    public Personage(String nam, double hlth, double arm, double parm, double res){
        name = nam;
        health = hlth;
        armor = arm;
        piercingArmor = parm;
        resistance = res;
    }

    public String getName(){
        return name;
    }

    public double getHealth(){
        if (health > 0){
            return health;
        } else {
            health = 0;
            return health;
        }
    }

    public double getArmor(){
        return armor;
    }

    public double getPiercingArmor(){
        return piercingArmor;
    }

    public double getResistance(){
        return resistance;
    }

    public void setHealth(double hlth){
        health = hlth;
    }

//    The following block of setters is temporally unused

//    public void setArmor(int arm){
//        armor = arm;
//    }
//
//    public void setPiercingArmor(int parm){
//        piercingArmor = parm;
//    }
//
//    public void setResistance(int res){
//        resistance = res;
//    }

    public boolean isAlive(){
        if (health > 0){
            return true;
        } else return  false;
    }
}
