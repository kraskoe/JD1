package Lesson6FiguresWithInnerClasses;

/**
 * Created by User on 01.07.2017.
 */
public class TestFigures {
    public static void main(String[] args) {

        //Create points
        Point a = new Point(5, 5);
        Point b = new Point(10, 5);
        Point c = new Point(10, 1);
        Point d = new Point(5, 1);
        Point e = new Point(7, 7);

        //Create figures
        Rectangle myRectangle = new Rectangle(a, b, c, d);
        Quadrate myQuadrate = new Quadrate(5);
        Circle myCircle = new Circle(7);
        Trigon myTriangle = new Trigon(a, b, e);
        RightTriangle myRTriangle = new RightTriangle(a,b,c);
        EquilateralTriangle myEqTriangle = new EquilateralTriangle(8);

        //Compare figures
        ShapeUtils.PrintCheck.printCheck();
        System.out.println(ShapeUtils.isTriangle(myEqTriangle));
        System.out.println(ShapeUtils.isTriangle(myTriangle));
        System.out.println(ShapeUtils.isTriangle(myRTriangle));
        System.out.println(ShapeUtils.isRectangle(myRTriangle));
        System.out.println(ShapeUtils.isRectangle(myQuadrate));
        System.out.println(ShapeUtils.isRectangle(myRectangle));

        //Calculate diagonals and altitudes
        System.out.println("");

        myRectangle.printDiagonals();
        myTriangle.printAltitude();
        myRTriangle.printAltitude();
        myEqTriangle.printAltitude();

        System.out.println("");

        //Anonimous class "on-the-run"
       new Quadrate(6){
            private double diag = Math.sqrt(2 * Math.pow(6, 2));
            public void printDiag(){
                System.out.printf("Diagonal of this quadrate: %f\n", diag);
            }
        }.printDiag();

        System.out.println("");

        //Print objects
        System.out.println(myCircle.toString());
        System.out.println(myRectangle.toString());
        System.out.println(myQuadrate.toString());
        System.out.println(myTriangle.toString());
        System.out.println(myRTriangle.toString());
        System.out.println(myEqTriangle.toString());

        System.out.println("");

        //Compare squares
        myQuadrate.compareFigures(myRectangle);
    }
}
