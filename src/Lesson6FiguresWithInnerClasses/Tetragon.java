package Lesson6FiguresWithInnerClasses;

/**
 * Created by User on 30.06.2017.
 */
public class Tetragon extends Figure {
    protected Point upperLeft, upperRight, bottomLeft, bottomRight;
    protected double aSide, bSide, cSide, dSide;
    double halfPerimeter;
    public Diagonal diagonal;

    Tetragon(Point a, Point b, Point c, Point d) {
        upperLeft = a;
        upperRight = b;
        bottomRight = c;
        bottomLeft = d;
        aSide = a.distance(b);
        bSide = b.distance(c);
        cSide = c.distance(d);
        dSide = d.distance(a);
        name = "tetragon";
        diagonal = new Diagonal(a, b, c, d);
    }

    Tetragon(double a, double b, double c, double d) {
        aSide = a;
        bSide = b;
        cSide = c;
        dSide = d;
        name = "tetragon";
        diagonal = new Diagonal(a, b, c, d);
    }

    Tetragon() {};

    public double getPerimeter() {
        return aSide + bSide + cSide + dSide;
    }

    public double getSquare() {
        halfPerimeter = getPerimeter() / 2;
        return Math.sqrt((halfPerimeter - aSide) * (halfPerimeter - bSide) * (halfPerimeter - cSide) * (halfPerimeter - dSide));
    }

    public void printDiagonals(){
        System.out.printf("Figure: %s. First diagonal: %f. Second diagonal: %f. \n", name, diagonal.getDiagonalA(), diagonal.getDiagonalB());
    }

    //Inner class Diagonal
    class Diagonal {
        private double diagonalA, diagonalB;

        public Diagonal(Point a, Point b, Point c, Point d) {
            diagonalA = a.distance(c);
            diagonalB = b.distance(d);
        }

        public Diagonal(double a, double b, double c, double d) {
            diagonalA = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); //Это формула-заглушка!
            diagonalB = Math.sqrt(Math.pow(c, 2) + Math.pow(d, 2)); //Это формула-заглушка!
        }

        public double getDiagonalA() {
            return diagonalA;
        }

        public double getDiagonalB() {
            return diagonalB;
        }
    }
}




