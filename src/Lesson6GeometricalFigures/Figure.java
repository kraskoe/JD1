package Lesson6GeometricalFigures;

/**
 * Created by User on 30.06.2017.
 */
public abstract class Figure implements FigureMethods {
    private String name = "figure";

    public String getName(){
        return name;
    }

    public abstract double getSquare();

    public abstract double getPerimeter();

    <T extends Figure> void compareFigures(T figure){
        switch (this.getSquare() > figure.getSquare() ? 1 : this.getSquare() == figure.getSquare() ? 0 : -1) {
            case -1:
                System.out.println("The square of first figure is less than second");
                break;
            case 0:
                System.out.println("The squares of figures sre equal");
                break;
            case 1:
                System.out.println("The square of first figure is more than second");
                break;
        }
    }

}
