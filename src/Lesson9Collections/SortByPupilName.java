package Lesson9Collections;

import java.util.Comparator;

/**
 * Created by ADMIN on 07.07.2017.
 */
public class SortByPupilName implements Comparator <String> {
    public int compare(String obj1, String obj2){
        String str1 = obj1;
        String str2 = obj2;
        return str1.compareTo(str2);
    }
}
