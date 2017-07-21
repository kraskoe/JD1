package Lesson15MultyStream;

import java.util.Random;

/**
 * Created by ADMIN on 21.07.2017.
 */
public class Part {
    private Parts part;

    public Part(int i){
        switch (i){
            case 0:
                part = Parts.HEAD;
                break;
            case 1:
                part = Parts.BODY;
                break;
            case 2:
                part = Parts.LARM;
                break;
            case 3:
                part = Parts.RARM;
                break;
            case 4:
                part = Parts.LLEG;
                break;
            case 5:
                part = Parts.RLEG;
                break;
            case 6:
                part = Parts.CPU;
                break;
            case 7:
                part = Parts.RAM;
                break;
            case 8:
                part = Parts.HDD;
                break;
        }
    }

    public Part(){
        new Part(new Random().nextInt(9));
    }

    public Parts getPart(){
        return part;
    }
}
