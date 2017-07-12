package Lesson11InputOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ADMIN on 12.07.2017.
 */
public class Lesson11Test {
    public static void main(String[] args) {
        //Task 1
        System.out.printf("Task 1. Read lines from file%n%n");

        File textFile = new File("E://Java//Git//practice//src//TXTfiles//task1text.txt");
        try (BufferedReader bfr = new BufferedReader(new FileReader(textFile))) {
//        File textFile = new File(".." + File.separator, "TXTfiles" + File.separator + "task1text.txt");
//        try (BufferedReader bfr = new BufferedReader(new FileReader(textFile))) {
//        try (BufferedReader bfr = new BufferedReader(new FileReader("E://Java//Git//practice//src//TXTfiles//task1text.txt"))) {
            String temp;
            while ((temp = bfr.readLine()) != null){
                System.out.println(temp);
            }
        } catch (FileNotFoundException fe){
            System.out.println(fe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

        //Task 2
        System.out.printf("%nTask 2. Find words begin from vocals%n%n");

        StringBuilder tempString = new StringBuilder();
        try (BufferedReader fr = new BufferedReader(new FileReader(textFile))) {
            String temp;
            while ((temp = fr.readLine()) != null){
                tempString.append(temp);
                tempString.append(" ");
            }
        } catch (IOException ie) {
            ie.getMessage();
        }
        char[] vocals = {'а', 'е', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'};
        String[] wordsArray = tempString.toString().toLowerCase().split("[.,;:!?\\u0020]+");
        for (String s : wordsArray){
//            if (Arrays.asList(vocals).contains(s.charAt(0))) {
            if (s.charAt(0) == 'а' || s.charAt(0) == 'е' || s.charAt(0) == 'и' || s.charAt(0) == 'о' || s.charAt(0) == 'у'
                    || s.charAt(0) == 'ы' || s.charAt(0) == 'э' || s.charAt(0) == 'ю' || s.charAt(0) == 'я') {
                System.out.print(s + " ");

            }
        }
        System.out.println("");

        //Task 3
        System.out.printf("%nTask 3. Find words begin from last letter of previous words%n%n");

        String tempWord = "!";
        for (String s : wordsArray) {
            if (tempWord.charAt(tempWord.length()-1) == s.charAt(0)){
                System.out.print(tempWord + " " + s);
                System.out.println("");
            }
            tempWord = s;
        }

    }
}
