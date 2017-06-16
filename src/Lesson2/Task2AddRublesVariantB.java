package Lesson2;

import java.util.Scanner;

/**
 * Created by Yauheni Krasko on 13.06.2017.
 */
public class Task2AddRublesVariantB {
    public static void main(String[] args) {
        int rublesSum;
        Scanner sumIn = new Scanner(System.in);
        System.out.println("Введите сумму в рублях:");
        if (sumIn.hasNextInt()) {
            rublesSum = sumIn.nextInt();
        } else {
            System.out.println("Это не целое число!");
            return;
        }

        switch (rublesSum/10%10){
            case 1:
                System.out.println(rublesSum + " рублей");
                break;
            default:
                switch (rublesSum%10){
                    case 1:
                        System.out.println(rublesSum + " рубль");
                        break;
                    case 2:
                    case 3:
                    case 4:
                        System.out.println(rublesSum + " рубля");
                        break;
                    default:
                        System.out.println(rublesSum + " рублей");
                        break;
                }
        }
    }
}