package Lesson2;

import java.util.Scanner;

/**
 * Created by Yauheni Krasko on 14.06.2017.
 */
public class Task4RealDateCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day:");
        int day = input.nextInt();
        System.out.println("Enter the month:");
        int month = input.nextInt();
        System.out.println("Enter the year:");
        int year = input.nextInt();

        boolean leapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leapYear = true;
                } else {
                    leapYear = false;
                }
            } else {
                leapYear = true;
            }
        } else {
            leapYear = false;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day >= 1 && day <= 31) {
                    System.out.println("Введенная дата реальна");
                } else {
                    System.out.println("Введенная дата нереальна");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day >= 1 && day <= 30) {
                    System.out.println("Введенная дата реальна");
                } else {
                    System.out.println("Введенная дата нереальна");
                }
                break;
            case 2:
                if (leapYear == true) {
                    if (day >= 1 && day <= 29) {
                        System.out.println("Введенная дата реальна");
                    } else {
                        System.out.println("Введенная дата нереальна");
                    }
                } else if (day >= 1 && day <= 28) {
                    System.out.println("Введенная дата реальна");
                } else {
                    System.out.println("Введенная дата нереальна");
                }
                break;
            default:
                System.out.println("Введенная дата нереальна");
                break;
        }
    }
}
