package Lesson12InputOutputPart2;

import java.io.Serializable;

/**
 * Created by User on 16.07.2017.
 */
public class Touchpad implements Serializable {
    String manufacturer;
    int buttons;

    public Touchpad (String s, int i){
        manufacturer = s;
        buttons =i;
    }
}
