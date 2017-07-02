package Lesson6FiguresWithInnerClasses;

/**
 * Created by User on 01.07.2017.
 */
public class Circle extends Figure {
    protected double radius;

    Circle (double rad){
        radius = rad;
        name = "circle";
    }

    public double getSquare(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Figure: " + this.getName() + ". Radius: " + this.radius + ". Perimeter: " + this.getPerimeter()+ ". Square: " + this.getSquare();
    }
}
