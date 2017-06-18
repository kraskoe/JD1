package Lesson4;

/**
 * Created by User on 18.06.2017.
 */
public class Task3Points {
    public static void main(String[] args) {
        Point point1 = new Point(5, -4);
        Point point2 = new Point(-3, 2);

        point1.getCoordinates();
        point2.setCoordinates(-7, 8);

        System.out.println("Distance between points equal to:" + point1.distance(point2));

        Rectangle myRectangle = new Rectangle(5, 7, 15, 2);
        System.out.println("Diagonal of rectangle equal to:" + myRectangle.diagonalOfRectangle());
        System.out.println("Square of rectangle equal to:" + myRectangle.squareOfRectangle());
    }
}
