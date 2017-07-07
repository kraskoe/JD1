package Lesson9Collections;

/**
 * Created by ADMIN on 07.07.2017.
 */
public enum Subjects {
    MATHEMATICS("Математика"),
    PHYSICS("Физика"),
    ECONOMICS("Экономика"),
    BIOLOGY("Биология"),
    HISTORY("История"),
    GEOGRAPHY("География"),
    CHEMISTRY("Химия");

    private String value;

    Subjects (String n){
        value = n;
    }

    Subjects (){};

    public String getValue(){
        return value;
    }

    }
