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
        details.put(Parts.HEAD, 0);
        details.put(Parts.BODY, 0);
        details.put(Parts.LARM, 0);
        details.put(Parts.RARM, 0);
        details.put(Parts.LLEG, 0);
        details.put(Parts.RLEG, 0);
        details.put(Parts.CPU, 0);
        details.put(Parts.RAM, 0);
        details.put(Parts.HDD, 0);
    }

//    public void setRobotsReady(int r){
//        robotsReady = r;
//    }

    public int getRobotsReady(){
        return robotsReady;
    }

    public void collectRobots(){
        while (details.get(Parts.HEAD) > 0 &&
                details.get(Parts.BODY) > 0 &&
                details.get(Parts.LARM) > 0 &&
                details.get(Parts.RARM) > 0 &&
                details.get(Parts.LLEG) > 0 &&
                details.get(Parts.RLEG) > 0 &&
                details.get(Parts.CPU) > 0 &&
                details.get(Parts.RAM) > 0 &&
                details.get(Parts.HDD) > 0){
            robotsReady += 1;
            details.forEach((key, value) -> value--);
        }
    }
}
