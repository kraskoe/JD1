package Lesson6FiguresWithInnerClasses;

/**
 * Created by User on 01.07.2017.
 */
public class ShapeUtils {
    public static boolean isRectangle(Object obj){
        if (obj instanceof Rectangle){
            return true;
        } else return false;
    }

    public static boolean isTriangle(Object obj){
        if (obj instanceof Trigon){
            return true;
        } else return false;
    }

    //Static nested class
    public static class PrintCheck{
        public static void printCheck(){
            System.out.println("This is check for instance");
        }
    }
}
