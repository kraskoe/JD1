package Lesson9Collections;

import javafx.collections.transformation.SortedList;

import javax.swing.text.html.parser.Entity;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;

/**
 * Created by ADMIN on 07.07.2017.
 */
public class Lesson9Test {
    public static void main(String[] args) {
        final int ELEMENT_SIZE = 10;

        List pupils = new ArrayList();
        for (Pupils p : Pupils.values()){
            pupils.add(p);
        }

        List subjects = new ArrayList();
        for (Subjects s : Subjects.values()){
            subjects.add(s);
        }

        //Task 1
        System.out.printf("~~~Task 1. Delete bad marks~~~\n\n");
        List <Mark> pupilsMarks = new ArrayList <>(ELEMENT_SIZE);
        ListIterator <Mark> listIter = pupilsMarks.listIterator();

        for (int i = 0; i < ELEMENT_SIZE; i++){
            listIter.add((new Mark(new Random().nextInt(10) + 1,
                    pupils.get(new Random().nextInt(pupils.size())).toString(),
                    subjects.get(new Random().nextInt(subjects.size())).toString())));
            System.out.println(pupilsMarks.get(i));
        }

//        for (int i = 0; i < 20; i++){
//            pupilsMarks.add((new Mark(new Random().nextInt(10) + 1, pupils.get(new Random().nextInt(pupils.size())).toString(),
//                    subjects.get(new Random().nextInt(subjects.size())).toString())));
//            System.out.println(pupilsMarks.get(i));
//        }

        while (listIter.hasPrevious()){
            listIter.previous();
        }
        System.out.printf("\nDeleting bad marks\n\n");

        while (listIter.hasNext()){
            if (listIter.next().getValue() < 4){
                listIter.remove();
            }
        }

        while (listIter.hasPrevious()){
            listIter.previous();
        }

        while (listIter.hasNext()){
            System.out.println(listIter.next());
        }

        //Task 2
        int temp;

        System.out.printf("\n~~~Task 2. Find max mark~~~\n\n");

        List <Mark> pupilsMarks2 = new LinkedList<>();
        ListIterator <Mark> listIter2 = pupilsMarks2.listIterator();

        for (int i = 0; i < ELEMENT_SIZE; i++){
            listIter2.add((new Mark(new Random().nextInt(10) + 1,
                    pupils.get(new Random().nextInt(pupils.size())).toString(),
                    subjects.get(new Random().nextInt(subjects.size())).toString())));
            System.out.println(pupilsMarks2.get(i));
        }

        while (listIter2.hasPrevious()){
            listIter2.previous();
        }

        int max = pupilsMarks2.get(0).getValue();

        while (listIter2.hasNext()){
            if ((temp = listIter2.next().getValue()) > max){
                max = temp;
            }
        }

        System.out.printf("\nThe highest mark is %d\n", max);

        //Task 3
        System.out.printf("\n~~~Task 3. Reverse pupils~~~\n\n");

        Set <String> pupilsSet = new TreeSet <>();

        for (Mark m : pupilsMarks2){
            pupilsSet.add(m.getPupil());
        }

        List <String> pupilsList = new ArrayList<>(pupilsSet);

        Collections.reverse(pupilsList);
        for (String s : pupilsList){
            System.out.println(s);
        }

        System.out.println("");

        List <String> pupilsList2 = new ArrayList<>();

        for (Mark m : pupilsMarks2){
            pupilsList2.add(m.getPupil());
        }

//        Collections.sort(pupilsList2);
        Collections.sort(pupilsList2, new SortByPupilName());

        Collections.reverse(pupilsList2);
        for (String s : pupilsList){
            System.out.println(s);
        }

        //Task 4
        System.out.printf("\n~~~Task 4. Frequency dictionary~~~\n\n");

        String checkedString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed nunc erat, hendrerit at " +
                "nisl sit amet, vehicula euismod nulla. Nam sodales bibendum ligula sed iaculis. Nunc commodo neque dui," +
                " eu vehicula est mattis ac. Fusce lacus magna, sodales eget arcu vel, sollicitudin lacinia ipsum." +
                " Vestibulum blandit risus vel neque semper, et commodo turpis ullamcorper. Suspendisse a justo justo." +
                " In lacinia rhoncus orci ac condimentum. Pellentesque scelerisque ante vitae vehicula condimentum." +
                " Fusce malesuada eu felis a vestibulum. Nunc porttitor turpis eu bibendum bibendum. Ut pulvinar felis" +
                " quis nibh tempus, non volutpat enim ullamcorper. Mauris at tortor vestibulum, accumsan turpis quis," +
                " elementum lacus. Nam fermentum cursus neque ac faucibus. Proin auctor vel sem eget volutpat.";

        List <String> wordsList = new ArrayList<>();

        int k = 0;

        for (int j = 0; j < checkedString.length(); j++) {
            if (checkedString.charAt(j) == ' ' | checkedString.charAt(j) == '.' | checkedString.charAt(j) == ',' |
                    checkedString.charAt(j) == '!' | checkedString.charAt(j) == '?' | checkedString.charAt(j) == ':' |
                    checkedString.charAt(j) == ';') {
                if (j > k) {
                    wordsList.add(checkedString.substring(k, j));
                }
                k = j + 1;
            }
        }

        Set wordsSet = new HashSet();
        Map <String, Integer> wordsFrequencyMap = new TreeMap();

        try {
            for (int i = 0; i < wordsList.size(); i++){
                if (wordsSet.add(wordsList.get(i))){
                    wordsFrequencyMap.put(wordsList.get(i), 1);
                } else {
                    if (wordsFrequencyMap.containsKey(wordsList.get(i))){
                        int counter = wordsFrequencyMap.get(wordsList.get(i));
                        wordsFrequencyMap.put(wordsList.get(i), counter + 1);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

//        String[] wordsArray = checkedString.split("[ .,;:!?]");
//
//        Set wordsSet = new HashSet();
//        Map <String, Integer> wordsFrequencyMap = new TreeMap();
//
//        try {
//            for (int i = 0; i < wordsArray.length; i++){
//                if (wordsSet.add(wordsArray[i])){
//                    wordsFrequencyMap.put(wordsArray[i], 1);
//                } else {
//                    if (wordsFrequencyMap.containsKey(wordsArray[i])){
//                        int counter = wordsFrequencyMap.get(wordsArray[i]);
//                        wordsFrequencyMap.put(wordsArray[i], counter + 1);
//                    }
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
        for (Map.Entry en : wordsFrequencyMap.entrySet()){
            System.out.println(en.getKey() + " : " + en.getValue());
        }

        //Task 5
        System.out.printf("\n~~~Task 5. Reverse numbers~~~\n\n");

//        Double number = 23436436.2524;
        BigDecimal number = new BigDecimal(23436436.2524).setScale(4, BigDecimal.ROUND_HALF_UP);
        System.out.println(number.toString());
        Deque <String> numberDeque = new ArrayDeque <>();
        String[] numberArray = number.toString().split("");

        for (int i = 0; i < numberArray.length; i++){
            numberDeque.add(numberArray[i]);
        }

        while (numberDeque.peekLast() != null){
            System.out.print(numberDeque.pollLast());
        }
        System.out.println("");
    }
}
