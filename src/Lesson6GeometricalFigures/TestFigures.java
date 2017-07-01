package Lesson6GeometricalFigures;

/**
 * Created by User on 01.07.2017.
 */
public class TestFigures {
    public static void main(String[] args) {
        Point a = new Point(5, 5);
        Point b = new Point(10, 5);
        Point c = new Point(10, 1);
        Point d = new Point(5, 1);
        Point e = new Point(7, 7);

        Rectangle myRectangle = new Rectangle(a, b, c, d);
        Quadrate myQuadrate = new Quadrate(5);
        Circle myCircle = new Circle(7);
        Trigon myTriangle = new Trigon(a, b, e);
        RightTriangle myRTriangle = new RightTriangle(a,b,c);
        EquilateralTriangle myEqTriangle = new EquilateralTriangle(8);

        System.out.println(ShapeUtils.isTriangle(myEqTriangle));
        System.out.println(ShapeUtils.isTriangle(myTriangle));
        System.out.println(ShapeUtils.isTriangle(myRTriangle));
        System.out.println(ShapeUtils.isRectangle(myRTriangle));
        System.out.println(ShapeUtils.isRectangle(myQuadrate));
        System.out.println(ShapeUtils.isRectangle(myRectangle));

        System.out.println(myCircle.toString());
        System.out.println(myRectangle.toString());
        System.out.println(myQuadrate.toString());
        System.out.println(myTriangle.toString());
        System.out.println(myRTriangle.toString());
        System.out.println(myEqTriangle.toString());
    }
}
