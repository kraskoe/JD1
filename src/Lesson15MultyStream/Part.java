package Lesson15MultyStream;

/**
 * Created by ADMIN on 21.07.2017.
 */
public enum Part {
    HEAD("Голова"),
    BODY("Тело"),
    LARM("Левая рука"),
    RARM("Правая рука"),
    LLEG("Левая нога"),
    RLEG("Правая нога"),
    CPU("CPU"),
    RAM("RAM"),
    HDD("HDD");

    private String value;

    Part(String n){
        value = n;
    }

    public String getValue(){
        return value;
    }
}
