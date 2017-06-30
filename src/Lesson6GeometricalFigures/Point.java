package Lesson6GeometricalFigures;

/**
 * Created by User on 18.06.2017.
 */
public class Point {
    private double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void getCoordinates() {
        System.out.printf("Coordinates of point: x = %d, y = %d", getX(), getY());
        System.out.println("");
    }

    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.getX() - p.getX(), 2) + Math.pow(this.getY() - p.getY(), 2));
    }

}
