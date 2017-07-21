package Lesson15MultyStream;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ADMIN on 21.07.2017.
 */
public class MadScientist {
    private int robotsReady = 0;
    Map<Enum,Integer> details;
    public MadScientist(){
        details = new HashMap<>();
        details.put(Part.HEAD, 0);
        details.put(Part.BODY, 0);
        details.put(Part.LARM, 0);
        details.put(Part.RARM, 0);
        details.put(Part.LLEG, 0);
        details.put(Part.RLEG, 0);
        details.put(Part.CPU, 0);
        details.put(Part.RAM, 0);
        details.put(Part.HDD, 0);
    }

//    public void setRobotsReady(int r){
//        robotsReady = r;
//    }

    public int getRobotsReady(){
        return robotsReady;
    }

    public void collectRobots(){
        while (details.get(Part.HEAD) > 0 &&
                details.get(Part.BODY) > 0 &&
                details.get(Part.LARM) > 0 &&
                details.get(Part.RARM) > 0 &&
                details.get(Part.LLEG) > 0 &&
                details.get(Part.RLEG) > 0 &&
                details.get(Part.CPU) > 0 &&
                details.get(Part.RAM) > 0 &&
                details.get(Part.HDD) > 0){
            robotsReady += 1;
            details.forEach((key, value) -> value--);
        }
    }
}
