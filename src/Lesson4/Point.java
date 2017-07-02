package Lesson4;

/**
 * Created by User on 18.06.2017.
 */
public class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void getCoordinates() {
        System.out.printf("Coordinates of point: x = %d, y = %d", x, y);
        System.out.println("");
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }

}
