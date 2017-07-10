package Lesson10Strings;

import java.util.Formatter;

/**
 * Created by ADMIN on 10.07.2017.
 */
public class Lesson10Test {
    public static void main(String[] args) {
        //Task 1.
        System.out.printf("Task 1. Compare String/StringBuffer methods working speed%n%n");

        String testString1 = new String();
        String testString2 = new String();
        String testString3 = new String();
        StringBuilder testStringBuilder = new StringBuilder();
        String addString = "ThisIsTestString";

        long startString1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            testString1 = testString1.concat(addString);
        }
        long finishString1 = System.currentTimeMillis();
        System.out.printf("Time of running program String.concat(): %d milliseconds%n", finishString1 - startString1);

        long startString2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            testString2 = testString2 + addString;
        }
        long finishString2 = System.currentTimeMillis();
        System.out.printf("Time of running program String + String: %d milliseconds%n", finishString2 - startString2);

        long startString3 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            testString3 += addString;
        }
        long finishString3 = System.currentTimeMillis();
        System.out.printf("Time of running program String +=: %d milliseconds%n", finishString3 - startString3);

        long startStringBuilder = System.currentTimeMillis();
        long startNanoSB = System.nanoTime();
        for (int i = 0; i < 10000; i++){
            testStringBuilder = testStringBuilder.append(addString);
        }
        long finishStringBuilder = System.currentTimeMillis();
        long finishNanoSB = System.nanoTime();
        System.out.printf("Time of running program StringBuilder.append(): %d milliseconds%n", finishStringBuilder - startStringBuilder);
        System.out.printf("Time of running program StringBuilder.append(): %d nanoseconds%n", finishNanoSB - startNanoSB);

        //Task 2.
        System.out.printf("%nTask 2. Change sad to smile%n%n");

        String stringWithSmiles = "This :( is ;) string :( full :D of :( smiles :(";

        System.out.println(stringWithSmiles.replace(":(", ":)"));

        //Task 3.
        System.out.printf("%nTask 3. Check if string begins or ends with word%n%n");

        String testS1 = "This is test string this";
        String testS2 = "This is test string";
        String testS3 = "Is test string this";
        String testWord = "ThIs";

        System.out.println(testS1);
        System.out.println(checkString(testS1, testWord));
        System.out.println(testS2);
        System.out.println(checkString(testS2, testWord));
        System.out.println(testS2);
        System.out.println(checkString(testS2, testWord));

        //Task 4.
        System.out.printf("%nTask 4. Return initials%n%n");

        String name = "василий";
        String patronym = "петрович";
        String surname = "Сидоров";

        System.out.println(returnInitials(name, patronym, surname));

        //Task 5.
        System.out.printf("%nTask 5. Counter of words in text%n%n");

        String checkedString = "Lorem ipsum dolor sit amet,  consectetur adipiscing elit. Sed nunc erat, hendrerit at " +
                "nisl sit amet, vehicula euismod nulla. Nam sodales bibendum ligula sed iaculis. Nunc commodo neque dui," +
                " eu vehicula est mattis ac. Fusce lacus    magna, sodales eget arcu vel, sollicitudin lacinia ipsum." +
                " Vestibulum blandit risus vel neque semper, et commodo turpis ullamcorper. Suspendisse a justo justo." +
                " In lacinia rhoncus orci ac condimentum.   Pellentesque scelerisque ante vitae vehicula condimentum." +
                " Fusce malesuada eu felis a vestibulum. Nunc porttitor turpis eu bibendum bibendum. Ut pulvinar felis" +
                " quis nibh tempus, non volutpat enim   ullamcorper. Mauris at tortor vestibulum, accumsan turpis quis," +
                " elementum lacus.   Nam fermentum cursus neque ac faucibus.    Proin auctor vel sem eget volutpat.";

        String[] wordsArray = checkedString.split("[.,;:!?\\u0020]+");

        System.out.printf("Number of words in text: %d%n", wordsArray.length);

        //Task 6.
        System.out.printf("%nTask 6. Delete duplicates%n%n");

        String startingString = new String("     Thiiiis isssss tesssst striiiiiiiinnnnnnggggg     ");

        System.out.println(startingString);

        System.out.println(deleteDuplicates(startingString));

        //Task 7.
        System.out.printf("%nTask 7. Test formatters%n%n");

        System.out.println(addZeroesString1(123));
        System.out.println(addZeroesString2(123));
        System.out.println(addZeroesStringBuilder(123));

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            addZeroesString1(123);
        }
        long finish1 = System.currentTimeMillis();
        System.out.printf("Time of running program: %d milliseconds%n", finish1 - start1);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            addZeroesString2(123);
        }
        long finish2 = System.currentTimeMillis();
        System.out.printf("Time of running program: %d milliseconds%n", finish2 - start2);

        long start3 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            addZeroesStringBuilder(123);
        }
        long finish3 = System.currentTimeMillis();
        System.out.printf("Time of running program: %d milliseconds%n", finish3 - start3);


    }

    public static boolean checkString(String testString, String word){
        if (testString != null && word != null){
            String wordToLC = word.toLowerCase();
            if (testString.toLowerCase().startsWith(wordToLC) & testString.toLowerCase().endsWith(wordToLC)){
                return true;
            } else return false;
        } else {
            System.out.println("One of arguments is null");
            return false;
        }
    }

    public static String returnInitials(String n, String p, String s){
        return s.toUpperCase().charAt(0) + "." + n.toUpperCase().charAt(0) + "." + p.toUpperCase().charAt(0) + ".";
    }

    public static String deleteDuplicates(String stStringRough){
        StringBuilder stString = new StringBuilder(stStringRough.trim());
        for (int i = 0; i < stString.length() - 1; i++) {
            if (stString.charAt(i) == stString.charAt(i + 1)) {
                stString.deleteCharAt(i + 1);
                i--;
            }
        }
        return new String(stString).trim();
    }

    public static String addZeroesString1(Object n){
        String nWZ = n.toString();
        if (nWZ.length() < 8){
            String formString = new String();
            for (int i = 0; i < 8 - nWZ.length(); i++){
                formString += "0";
            }
            formString += nWZ;
            return formString;
        } else return nWZ;
    }

    public static String addZeroesString2(Object n){
        return n.toString().format("%08d", n);
    }

    public static StringBuilder addZeroesStringBuilder(Object n){
        StringBuilder nWZB = new StringBuilder(n.toString());
        if (nWZB.length() < 8){
            int tempLength = 8 - nWZB.length();
            for (int i = 0; i < tempLength; i++){
                nWZB.insert(0, "0");
            }
            return nWZB;
        } else return nWZB;
    }
}
