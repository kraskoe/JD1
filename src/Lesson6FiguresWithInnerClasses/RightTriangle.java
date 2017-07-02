package Lesson6FiguresWithInnerClasses;

/**
 * Created by User on 01.07.2017.
 */
public class RightTriangle extends Trigon {
    protected double legA, legB;

    RightTriangle (Point a, Point b, Point c){
        super(a, b, c);
        getLegs();
        name = "right triangle";
    }

    RightTriangle (double a, double b, double c){
        super(a, b, c);
        getLegs();
        name = "right triangle";
    }

    public void getLegs(){
        if (aSide > bSide){
            if (aSide > cSide){
                legA = bSide;
                legB = cSide;
            } else {
                legA = aSide;
                legB = bSide;
            }
        } else {
            if (bSide > cSide){
                legA = aSide;
                legB = cSide;
            } else {
                legA = aSide;
                legB = bSide;
            }
        }
    }

    @Override
    public double getSquare(){
        return legA * legB /2;
    }

    @Override
    public String toString(){
        return "Figure: " + this.getName() + ". First leg: " + legA + ". Second leg: " + legB + ". Perimeter: " + this.getPerimeter()+ ". Square: " + this.getSquare();
    }
}
