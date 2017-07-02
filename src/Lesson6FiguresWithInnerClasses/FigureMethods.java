package Lesson6FiguresWithInnerClasses;

/**
 * Created by User on 30.06.2017.
 */
public interface FigureMethods {
    double getPerimeter();

    double getSquare();

    <T extends Figure> void compareFigures(T figure);
}
