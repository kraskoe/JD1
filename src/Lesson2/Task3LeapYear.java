package Lesson2;

import java.util.Scanner;

/**
 * Created by Yauheni Krasko on 14.06.2017.
 */
public class Task3LeapYear {
    public static void main(String[] args) {
        Scanner yearIn = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = yearIn.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Год високосный");
                } else {
                    System.out.println("Год не високосный");
                }
            } else {
                System.out.println("Год високосный");
            }
        } else {
            System.out.println("Год не високосный");
        }
    }
}
