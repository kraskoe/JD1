package Lesson4;

/**
 * Created by User on 17.06.2017.
 */
public class TimeClass {
    private int seconds, minutes, hours;

    TimeClass(int sec) {
        hours = sec / 3600;
        minutes = sec % 3600 / 60;
        seconds = sec - hours * 3600 - minutes * 60;
    }

    TimeClass(int h, int min, int sec) {
        hours = h;
        minutes = min;
        seconds = sec;
    }

    private int getTimeInSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }

    public void getTime() {
        System.out.println("Current time: " + hours + " hours " + minutes + " minutes " + seconds + " seconds.");
        System.out.println("Current time in seconds: " + getTimeInSeconds());
    }
}
