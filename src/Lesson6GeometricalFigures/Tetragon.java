package Lesson6GeometricalFigures;

import Heroes.Personage;

/**
 * Created by User on 30.06.2017.
 */
public class Tetragon extends Figure implements Tetra {
    protected Point upperLeft,upperRight, bottomLeft, bottomRight;
    protected double aSide, bSide, cSide, dSide;
    double halfPerimeter;

//    public double getASide(){
//        return aSide;
//    }
//
//    public double getBSide(){
//        return bSide;
//    }
//
//    public double getCSide(){
//        return cSide;
//    }
//
//    public double getDSide(){
//        return dSide;
//    }

    Tetragon (Point a, Point b, Point c, Point d){
        upperLeft = a;
        upperRight = b;
        bottomRight = c;
        bottomLeft = d;
        aSide = a.distance(b);
        bSide = b.distance(c);
        cSide = c.distance(d);
        dSide = d.distance(a);
        name = "tetragon";
    }

    Tetragon (double a, double b, double c, double d){
        aSide = a;
        bSide = b;
        cSide = c;
        dSide = d;
        name = "tetragon";
    }

    Tetragon (){};

    public double getPerimeter(){
        return aSide + bSide + cSide + dSide;
    }

    public double getSquare(){
        halfPerimeter = getPerimeter() / 2;
        return Math.sqrt((halfPerimeter - aSide) * (halfPerimeter - bSide) * (halfPerimeter - cSide) * (halfPerimeter - dSide));
    }

    public double getDiagonalA() {
        return upperLeft.distance(bottomRight);
    }

    public double getDiagonalB() {
        return upperRight.distance(bottomLeft);
    }

}



