package Lesson4;

/**
 * Created by User on 18.06.2017.
 */
public class Rectangle {
    Point upperLeftCorner, upperRightCorner, lowerRightCorner, lowerLeftCorner;

    Rectangle(int p1x, int p1y, int p2x, int p2y){
        upperLeftCorner = new Point(p1x, p1y);
        lowerRightCorner = new Point(p2x, p2y);
        upperRightCorner = new Point(p2x, p1y);
        lowerLeftCorner = new Point(p1x, p2y);
    }

    public double diagonalOfRectangle(){
        return Math.sqrt(Math.pow(upperLeftCorner.x - lowerRightCorner.x, 2) + Math.pow(upperLeftCorner.y - lowerRightCorner.y, 2));
    }

    public double squareOfRectangle(){
        return (upperLeftCorner.y - lowerLeftCorner.y) * (upperRightCorner.x - upperLeftCorner.x);
    }
}
