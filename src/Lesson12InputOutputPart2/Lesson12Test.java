package Lesson12InputOutputPart2;

import com.sun.corba.se.impl.oa.toa.TOA;

import java.io.*;

/**
 * Created by User on 16.07.2017.
 */
public class Lesson12Test {
    public static void main(String[] args) {
        //Task 1
        System.out.printf("Task 1. Compare reading/writing speed of buffered/non buffered streams%n%n");

        File file1 = new File("tmp", "charfile1");
        long start1 = System.currentTimeMillis();
        try (FileWriter fw = new FileWriter(file1);
        FileReader fr = new FileReader(file1)){
            for (int i = 0; i < 5242880; i++){
                fw.write("a");
            }
            while (fr.read() != -1){};
        } catch (IOException ie){
            ie.printStackTrace();
        }
        long finish1 = System.currentTimeMillis();
        System.out.println("Time of writing/reading without buffer is: " + (finish1 - start1));

        File file2 = new File("tmp", "charfile2");
        long start2 = System.currentTimeMillis();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file2));
        BufferedReader br = new BufferedReader(new FileReader(file2))){
            for (int i = 0; i < 5242880; i++){
                bw.write("a");
            }
            while (br.read() != -1){};
        } catch (IOException ie){
            ie.printStackTrace();
        }
        long finish2 = System.currentTimeMillis();
        System.out.println("Time of writing/reading without buffer is: " + (finish2 - start2));

        //Task 2
        System.out.printf("%nTask 2. Serialize computer%n%n");

        File tempFile = new File("tmp", "temp");
        Computer myComp = new Computer(8192, 2133, "Intel");
        Computer myBackupComp = new Computer();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(tempFile));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(tempFile))){
            oos.writeObject(myComp);
            myBackupComp = (Computer) ois.readObject();
        } catch (IOException ie){
            ie.printStackTrace();
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        }
        System.out.println("RAM: " + myBackupComp.ram);
        System.out.println("Processor frequency: " + myBackupComp.frequency);
        System.out.println("Processor: " + myBackupComp.processor);

        //Task 3
        System.out.printf("%nTask 3. Serialize notebook%n%n");
        Touchpad touch = new Touchpad("Touch Dinamycs", 2);
        Notebook myNote = new Notebook(6144, 1888, "AMD", "JS-18VKV", touch);
        File tempFile2 = new File("tmp", "temp2");
        Notebook myBackupNote = new Notebook();
        try (ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream(tempFile2));
             ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream(tempFile2))){
            oos2.writeObject(myNote);
            myBackupNote = (Notebook) ois2.readObject();
        } catch (IOException ie){
            ie.printStackTrace();
        } catch (ClassNotFoundException ce) {
            ce.printStackTrace();
        }
        System.out.println("RAM: " + myBackupNote.ram);
        System.out.println("Processor frequency: " + myBackupNote.frequency);
        System.out.println("Processor: " + myBackupNote.processor);
        System.out.println("Model: " + myBackupNote.model);
        System.out.println("Touchpad manufacturer: " + touch.manufacturer + ". Buttons: " + touch.buttons);
    }
}
