package Lesson9Collections;

/**
 * Created by ADMIN on 07.07.2017.
 */
public class Mark {
    private int value;
    private String pupil;
    private String subject;

    public Mark(int v, String p, String s){
        value = v;
        pupil = p;
        subject = s;
    }

    public Mark(){};

    public int getValue(){
        return value;
    }

    public String getPupil(){
        return pupil;
    }

    public String getSubject(){
        return subject;
    }

    public int setValue(int v){
        value = v;
        return value;
    }

    public String setPupil(String p){
        pupil = p;
        return pupil;
    }

    public String setValue(String s){
        subject = s;
        return subject;
    }

    @Override
    public String toString(){
        return "Pupil: " + this.getPupil() + ". Subject: " + this.getSubject() + ". Mark: " + this.getValue();
    }
}
