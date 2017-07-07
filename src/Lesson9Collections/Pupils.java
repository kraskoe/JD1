package Lesson9Collections;

/**
 * Created by ADMIN on 07.07.2017.
 */
public enum Pupils {
    IVANOV("Иванов"),
    PETROV("Петров"),
    SIDOROV("Сидоров"),
    BUBNOV("Бубнов"),
    TREFOV("Трефов"),
    PIKOV("Пиков"),
    CHERVOV("Червов");

    private String name;

    Pupils(String n){
        name = n;
    }

    Pupils(){};

    public String getName(){
        return name;
    }
}
