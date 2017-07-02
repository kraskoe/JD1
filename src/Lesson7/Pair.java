package Lesson7;

/**
 * Created by User on 02.07.2017.
 */
public class Pair <K, V> {
    private K firstValue;
    private V secondvalue;

    Pair(K a, V b){
        firstValue = a;
        secondvalue = b;
    }

    public  K getFirstValue(){
        return firstValue;
    }

    public  V getSecondValue(){
        return secondvalue;
    }

    public void setFirstValue(K a){
        firstValue = a;
    }

    public void setSecondvalue(V a){
        secondvalue = a;
    }

    @Override
    public String toString(){
        return "Object Pair. First value: " + this.getFirstValue() + ". Second value: " + this.getSecondValue();
    }
}
