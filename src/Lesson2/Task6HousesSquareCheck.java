package Lesson2;

import java.util.Scanner;

/**
 * Created by Yauheni Krasko on 14.06.2017.
 */
public class Task6HousesSquareCheck {
    public static void main(String[] args) {
        int squareMeasurementE = 30;
        int squareMeasurementF = 50;

        Scanner square = new Scanner(System.in);
        System.out.println("Введите размер а первого дома");
        int firstHouseMeasurementA = square.nextInt();
        System.out.println("Введите размер b первого дома");
        int firstHouseMeasurementB = square.nextInt();
        System.out.println("Введите размер c второго дома");
        int secondHouseMeasurementC = square.nextInt();
        System.out.println("Введите размер d второго дома");
        int secondHouseMeasurementD = square.nextInt();

//        if (firstHouseMeasurementA + secondHouseMeasurementC <= squareMeasurementE) {
//            if (firstHouseMeasurementB + secondHouseMeasurementD <= squareMeasurementF) {
//                System.out.println("Дома помещаются на участке");
//            } else if (firstHouseMeasurementA + secondHouseMeasurementC <= squareMeasurementF) {
//                if (firstHouseMeasurementB + secondHouseMeasurementD <= squareMeasurementE) {
//                    System.out.println("Дома помещаются на участке");
//                } else {
//                    System.out.println("Дома не помещаются на участке");
//                }
//            }
//        } else if (firstHouseMeasurementA + secondHouseMeasurementD <= squareMeasurementE) {
//            if (firstHouseMeasurementB + secondHouseMeasurementC <= squareMeasurementF) {
//                System.out.println("Дома помещаются на участке");
//            } else if (firstHouseMeasurementA + secondHouseMeasurementD <= squareMeasurementF) {
//                if (firstHouseMeasurementB + secondHouseMeasurementC <= squareMeasurementE) {
//                    System.out.println("Дома помещаются на участке");
//                } else {
//                    System.out.println("Дома не помещаются на участке");
//                }
//            }
//        }

        if ((firstHouseMeasurementA + secondHouseMeasurementC <= squareMeasurementE &&
                firstHouseMeasurementB + secondHouseMeasurementD <= squareMeasurementF) ||
                (firstHouseMeasurementA + secondHouseMeasurementC <= squareMeasurementF &&
                        firstHouseMeasurementB + secondHouseMeasurementD <= squareMeasurementE) ||
                (firstHouseMeasurementA + secondHouseMeasurementD <= squareMeasurementE &&
                        firstHouseMeasurementB + secondHouseMeasurementC <= squareMeasurementF) ||
                (firstHouseMeasurementA + secondHouseMeasurementD <= squareMeasurementF &&
                        firstHouseMeasurementB + secondHouseMeasurementC <= squareMeasurementE)) {
            System.out.println("Дома помещаются на участке с размерами " + squareMeasurementE + " x " + squareMeasurementF);
        } else {
            System.out.println("Дома не помещаются на участке с размерами " + squareMeasurementE + " x " + squareMeasurementF);
        }
    }
}
