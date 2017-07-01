package Lesson6GeometricalFigures;

import sun.plugin.dom.css.Rect;

/**
 * Created by User on 30.06.2017.
 */
public class Quadrate extends Rectangle {

    Quadrate (Point a, Point b, Point c, Point d){
        super(a, b, c ,d);
        name = "quadrate";
    }

    Quadrate (double a, double b, double c, double d){
        super(a, b, c ,d);
        name = "quadrate";
    }

    Quadrate (double a){
        aSide = bSide = cSide = dSide = a;
        name = "quadrate";
    }

    @Override
    public double getPerimeter(){
        return aSide * 4;
    }

    @Override
    public double getSquare(){
        return Math.pow(aSide, 2);
    }

    @Override
    public String toString(){
        return "Figure: " + this.getName() + ". Side: " + aSide + ". Perimeter: " + this.getPerimeter()+ ". Square: " + this.getSquare();
    }
}
