package Lesson12InputOutputPart2;

import java.io.Serializable;

/**
 * Created by User on 16.07.2017.
 */
public class Computer implements Serializable {
    int ram, frequency;
    String processor;

    public Computer (int r, int f, String p){
        ram = r;
        frequency = f;
        processor = p;
    }

    public Computer (){};
}
