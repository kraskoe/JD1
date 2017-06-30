package Lesson6GeometricalFigures;

/**
 * Created by User on 30.06.2017.
 */
public class Rectangle extends Tetragon {
    private String name = "rectangle";

    Rectangle (Point a, Point b, Point c, Point d){
        super(a, b, c ,d);
    }

    Rectangle (double a, double b, double c, double d){
        super(a, b, c ,d);
    }

//    Rectangle (double a, double b){
//        aSide = cSide = a;
//        bSide = dSide = b;
//    }

    @Override
    public double getPerimeter(){
        return (aSide + bSide) * 2;
    }

    @Override
    public double getSquare(){
        return aSide * bSide;
    }
}
