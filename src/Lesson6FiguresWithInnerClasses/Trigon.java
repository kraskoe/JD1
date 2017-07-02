package Lesson6FiguresWithInnerClasses;

/**
 * Created by User on 30.06.2017.
 */
public class Trigon extends Figure {
    protected Point firstPoint,secondPoint, thirdPoint;
    protected double aSide, bSide, cSide;
    protected double halfPerimeter;
    public Altitude altitude;

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
        halfPerimeter = getPerimeter() / 2;
        altitude = new Altitude(aSide, bSide, cSide);
    }

    Trigon (double a, double b, double c){
        aSide = a;
        bSide = b;
        cSide = c;
        name = "trigon";
        halfPerimeter = getPerimeter() / 2;
        altitude = new Altitude(aSide, bSide, cSide);
    }

    Trigon (){};

    @Override
    public double getPerimeter(){
        return aSide + bSide + cSide;
    }

    @Override
    public double getSquare(){
        return Math.sqrt((halfPerimeter - aSide) * (halfPerimeter - bSide) * (halfPerimeter - cSide) * halfPerimeter);
    }

    public void printAltitude(){
        System.out.printf("Figure: %s. Altitude: %f.\n", name, altitude.getAltitude());
    }

    class Altitude {
        private double alt;

        public Altitude(double a, double b, double c) {
            double longestSide = a >= b ? (a >= c ? a : c) : (b >= c ? b : c);
            alt = 2 / longestSide * Math.sqrt((halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c) * halfPerimeter);
        }

        public double getAltitude() {
            return alt;
        }
    }


}
