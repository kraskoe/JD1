package Lesson15MultyStream;

import java.util.Random;

/**
 * Created by ADMIN on 21.07.2017.
 */
public class PartFactory {
    private Part part;

    public PartFactory(int i){
        switch (i){
            case 0:
                part = Part.HEAD;
                break;
            case 1:
                part = Part.BODY;
                break;
            case 2:
                part = Part.LARM;
                break;
            case 3:
                part = Part.RARM;
                break;
            case 4:
                part = Part.LLEG;
                break;
            case 5:
                part = Part.RLEG;
                break;
            case 6:
                part = Part.CPU;
                break;
            case 7:
                part = Part.RAM;
                break;
            case 8:
                part = Part.HDD;
                break;
        }
    }

    public PartFactory(){
       this(new Random().nextInt(9));
    }

    public Part getPart(){
        return part;
    }
}
