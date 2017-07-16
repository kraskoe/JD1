package Lesson12InputOutputPart2;

/**
 * Created by User on 16.07.2017.
 */
public class Notebook extends Computer {
    transient String model;
    Touchpad tpad;
    public Notebook(int r, int f, String p, String m, Touchpad t){
        super(r, f, p);
        model = m;
        tpad = t;
    }

    public Notebook (){};
}
