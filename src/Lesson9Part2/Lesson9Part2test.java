package Lesson9Part2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

/**
 * Created by User on 08.07.2017.
 */
public class Lesson9Part2test {
    public Lesson9Part2test() {
    }

    public static void main(String[] args) {
        final int ELEMENT_SIZE = 10;

        //Task 1
        System.out.printf("\n~~~Task 1. Method count unique~~~\n\n");

        List<Integer> randomList1 = new ArrayList<>();
        for (int i = 0; i < ELEMENT_SIZE; i++){
            randomList1.add(new Random().nextInt(21)-10);
        }

        for (Integer i : randomList1){
            System.out.println(i);
        }

        System.out.println("");

        System.out.println("Unique values in this list: " + countUnique(randomList1));

        //Task 2
        System.out.printf("\n~~~Task 2. Unique values~~~\n\n");

        Map <String, String> map1 = new HashMap <> ();
        map1.put("Marty", "Stepp");
        map1.put("Stuart", "Reges");
        map1.put("Jessica", "Miller");
        map1.put("Amanda", "Camp");
        map1.put("Hal", "Perkins");

        Map <String, String> map2 = new HashMap <> ();
        map2.put("Kendrick", "Perkins");
        map2.put("Stuart", "Reges");
        map2.put("Jessica", "Miller");
        map2.put("Bruce", "Reges");
        map2.put("Hal", "Perkins");

        System.out.println("");
        System.out.println(isUnique(map1));
        System.out.println("");
        System.out.println(isUnique(map2));

        //Task 3
        System.out.printf("\n~~~Task 3. Hashmaps~~~\n\n");

        Map newMap1 = new HashMap();
        Map newMap2 = new HashMap();

        newMap1.put(0, 5);
        newMap1.put(1, 7);
        newMap1.put(3, 4);
        newMap1.put(5, 9);
        newMap2.put(0, 5);
        newMap2.put(2, 5);
        newMap2.put(3, 8);
        newMap2.put(4, 2);

        Map resultMap = new TreeMap(Collections.reverseOrder());
        resultMap.putAll(newMap1);
        resultMap.putAll(newMap2);

        for (Object i : newMap1.keySet()){
            if (newMap2.containsKey(i)){
                resultMap.put(i, (Integer) newMap1.get(i) + (Integer) newMap2.get(i));
            }
        }

        System.out.println(resultMap);

        System.out.print("Your equation: ");

        int tempKey, tempValue;

        int counter = 1;
        for (Object obj : resultMap.keySet()){
            tempKey = (int) obj;
            tempValue = (int) resultMap.get(obj);

            if (tempKey == 1 || tempKey == 0) {
                if (tempKey == 1) {
                    System.out.printf("%dx", resultMap.get(obj));
                }
                if (tempKey == 0) {
                    System.out.printf("%d", resultMap.get(obj));
                }
            } else {
                System.out.printf("%dx^%d", resultMap.get(obj), obj);
            }
            if (++counter == resultMap.size() + 1) {
                System.out.printf("%n");
            } else System.out.print(" + ");
        }
    }

    public static int countUnique(List l){
        if (l.isEmpty()){
            return 0;
        } else {
            Set check = new HashSet(l);
            return check.size();
        }
    }

    public static boolean isUnique(Map l){
        if (l.isEmpty()){
            return false;
        }
        Set s = new HashSet();
        for (Object i : l.values()){
            s.add(i);
            System.out.println(i);
        }
        if (l.size() == s.size()){
            return true;
        } else return false;
    }
}
