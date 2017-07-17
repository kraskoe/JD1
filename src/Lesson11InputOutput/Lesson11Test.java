package Lesson11InputOutput;

import java.io.*;
import java.util.*;

/**
 * Created by ADMIN on 12.07.2017.
 */
public class Lesson11Test {
    public static void main(String[] args) {
        //Task 1
        System.out.printf("Task 1. Read lines from file%n%n");

        File textFile = new File("tmp", "task1text.txt");
        try (BufferedReader bfr = new BufferedReader(new FileReader(textFile))) {
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
//        char[] vocals = {'а', 'е', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'};
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

        //Task 4
        System.out.printf("%nTask 4. Numbers follow numbers%n%n");

        StringBuilder tmpstr = new StringBuilder();
        try (BufferedReader fr = new BufferedReader(new FileReader(textFile))) {
            String temp;
            while ((temp = fr.readLine()) != null){
                int maxCounter = 0;
                tmpstr.append(temp);
                String tmp = tmpstr.toString();
                int counter = 0;
                for (int i = 0; i < tmp.length(); i++){
                    if (tmp.charAt(i) == '0' || tmp.charAt(i) == '1' || tmp.charAt(i) == '2' || tmp.charAt(i) == '3' ||
                            tmp.charAt(i) == '4' || tmp.charAt(i) == '5' || tmp.charAt(i) == '6' || tmp.charAt(i) == '7' ||
                            tmp.charAt(i) == '8' || tmp.charAt(i) == '9'){
                        counter++;
                        if (maxCounter < counter) {
                            maxCounter = counter;
                        }
                    } else counter = 0;
                }
                System.out.println("Максимальное число цифр, идущих подряд: " + maxCounter);
                tmpstr = new StringBuilder();
            }
        } catch (IOException ie) {
            ie.getMessage();
        }

//        Task 5
        System.out.printf("%nTask 5. Working with binary file%n%n");

        int[] intArray = new int[20];
        for (int i= 0; i < intArray.length; i++){
            intArray[i] = new Random().nextInt(100);
            System.out.print(intArray[i] + " ");
        }

        File binaryFile = new File("tmp", "binaryfile");
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(binaryFile));
             DataInputStream din = new DataInputStream(new FileInputStream(binaryFile))){
            for (int i= 0; i < intArray.length; i++){
                dos.writeInt(intArray[i]);
            }

            System.out.println("");
            int integer, sum =0;
            int length = din.available()/4;
            for (int i= 0; i < length; i++){
                integer = din.readInt();
                System.out.print(integer + " ");
                sum += integer;
            }

            System.out.println("");
            double average = sum / intArray.length;
            System.out.println(average);


        } catch (IOException ie) {
            ie.printStackTrace();
        }

        //Task 6
        System.out.printf("%nTask 6. Directory tree%n%n");

        String dirname = "e:" + File.separator + "Java";
        File dir = new File(dirname);
        if (dir.isDirectory()){
            System.out.println("Directory: " + dir.getName());
            String[] dirList = dir.list();
            for (String innerDir : dirList) {
                File innerFile = new File(dirname + File.separator + innerDir);
                if (innerFile.isDirectory()){
                    System.out.println("    " + "Directory: " + innerFile.getName());
                } else if (innerFile.isFile()){
                    System.out.println("    " + "File: " + innerFile.getName());
                }
            }
        }

        //Task 7
        System.out.printf("%nTask 7. File reverse%n%n");

        File program = new File("src/Lesson2/Task1CompareWords.java");
        File reverseProgram = new File("tmp/reverseprogram.java");

        try (BufferedReader pread = new BufferedReader(new FileReader(program));
             BufferedWriter pwrite = new BufferedWriter(new FileWriter(reverseProgram))){
            String temp;
            while ((temp = pread.readLine()) != null){
                for (int i = temp.length()-1; i >=0; i--){
                    pwrite.write(temp.charAt(i));
                }
                pwrite.write("\n");
            }
        } catch (IOException ie) {
            ie.getMessage();
        } finally {
            if (reverseProgram.exists()){
                System.out.println("Программа выполнена успешно!");
            }
        }
    }
}
