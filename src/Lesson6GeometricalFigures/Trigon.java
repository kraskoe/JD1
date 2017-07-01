package Lesson6GeometricalFigures;

/**
 * Created by User on 30.06.2017.
 */
public class Trigon extends Figure implements Tri {
    protected Point firstPoint,secondPoint, thirdPoint;
    protected double aSide, bSide, cSide;
    protected double halfPerimeter, altitude;

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

    Trigon (Point a, Point b, Point c){
        firstPoint = a;
        secondPoint = b;
        thirdPoint = c;
        aSide = a.distance(b);
        bSide = b.distance(c);
        cSide = c.distance(a);
        name = "trigon";
    }

    Trigon (double a, double b, double c){
        aSide = a;
        bSide = b;
        cSide = c;
        name = "trigon";
    }

    Trigon (){};

    double longestSide = aSide >= bSide ? (aSide >= cSide ? aSide : cSide) : (bSide >= cSide ? bSide : cSide);

    @Override
    public double getPerimeter(){
        return aSide + bSide + cSide;
    }

    @Override
    public double getSquare(){
        halfPerimeter = getPerimeter() / 2;
        return Math.sqrt((halfPerimeter - aSide) * (halfPerimeter - bSide) * (halfPerimeter - cSide) * halfPerimeter);
    }

    public double getAltitude(){
        altitude = 2 / longestSide * Math.sqrt((halfPerimeter - aSide) * (halfPerimeter - bSide) * (halfPerimeter - cSide) * halfPerimeter);
        return altitude;
    }
}
