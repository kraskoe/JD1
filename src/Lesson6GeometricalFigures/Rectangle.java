package Lesson6GeometricalFigures;

import sun.plugin.dom.css.Rect;

/**
 * Created by User on 30.06.2017.
 */
public class Rectangle extends Tetragon {

    Rectangle (Point a, Point b, Point c, Point d){
        super(a, b, c ,d);
        name = "rectangle";
    }

    Rectangle (double a, double b, double c, double d){
        super(a, b, c ,d);
        name = "rectangle";
    }

    Rectangle (double a, double b){
        aSide = cSide = a;
        bSide = dSide = b;
        name = "rectangle";
    }

    Rectangle (){};

    @Override
    public double getPerimeter(){
        return (aSide + bSide) * 2;
    }

    @Override
    public double getSquare(){
        return aSide * bSide;
    }
}
