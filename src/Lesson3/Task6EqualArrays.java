package Lesson3;

import java.util.Scanner;

/**
 * Created by User on 15.06.2017.
 */
public class Task6EqualArrays {
    public static void main(String[] args) {
        int arrayLength;
        boolean flag = false;

        Scanner arrayLengthInput = new Scanner(System.in);
        System.out.println("Enter the size of arrays for compare:");
        arrayLength = arrayLengthInput.nextInt();

        int doubleArray1[][] = new int[arrayLength][arrayLength];
        int doubleArray2[][] = new int[arrayLength][arrayLength];

        for (int i = 0; i < doubleArray1.length; i++) {
            for (int j = 0; j < doubleArray1[0].length; j++) {
                doubleArray1[i][j] = randomInt();
            }
        }

        /* This code is for random filling of second array */

//        for (int i = 0; i < doubleArray2.length; i++) {
//            for (int j = 0; j < doubleArray2[0].length; j++) {
//                doubleArray2[i][j] = randomInt();
//            }
//        }

        for (int i = 0; i < doubleArray2.length; i++) {
            for (int j = 0; j < doubleArray2[0].length; j++) {
                doubleArray2[i][j] = doubleArray1[i][j];
            }
        }

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if (equals(doubleArray1[i][j], doubleArray2[i][j])) {
                    System.out.println("Compared elements are equal");
                } else System.out.println("Compared elements are not equal");
            }
        }


//        for (int i = 0; i < doubleArray1.length; i++){
//            for (int j = 0; j < doubleArray1[0].length; j++){
//                System.out.print(doubleArray1[i][j] + " ");
//            }
//            System.out.println("");
//        }
//
//        System.out.println("");
//
//        for (int i = 0; i < doubleArray2.length; i++){
//            for (int j = 0; j < doubleArray2[0].length; j++){
//                System.out.print(doubleArray2[i][j] + " ");
//            }
//            System.out.println("");
//        }
    }

    static int randomInt() {
        return (int) Math.random() * 100;
    }

    static boolean equals(int firstNumber, int secondNumber) {
        boolean bool = false;

        if (firstNumber == secondNumber) {
            bool = true;
        }
        return bool;
    }
}
