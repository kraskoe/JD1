package Lesson6GeometricalFigures;

/**
 * Created by User on 01.07.2017.
 */
public class EquilateralTriangle extends Trigon {

    EquilateralTriangle (Point a, Point b, Point c){
        super(a, b, c);
        name = "equilateral triangle";
    }

    EquilateralTriangle (double a, double b, double c){
        super(a, b, c);
        name = "equilateral triangle";
    }

    EquilateralTriangle (double a){
        aSide = bSide = cSide = a;
        name = "equilateral triangle";
    }

    @Override
    public double getPerimeter(){
        return aSide * 3;
    }

    @Override
    public double getSquare(){
        halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(Math.pow((halfPerimeter - aSide), 3)  * halfPerimeter);
    }

    @Override
    public double getAltitude(){
        altitude = Math.sqrt(Math.pow(aSide, 2) - Math.pow(aSide / 2, 2));
        return altitude;
    }

    @Override
    public String toString(){
        return "Figure: " + this.getName() + ". Side: " + aSide + ". Perimeter: " + this.getPerimeter()+ ". Square: " + this.getSquare();
    }
}
