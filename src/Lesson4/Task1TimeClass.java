package Lesson4;

/**
 * Created by User on 17.06.2017.
 */
public class Task1TimeClass {
    public static void main(String[] args) {
        TimeClass timeInSeconds = new TimeClass(343624);
        timeInSeconds.getTime();

        TimeClass timeInHours = new TimeClass(11, 43, 24);
        timeInHours.getTime();
    }
}
