package Lesson2;

import java.util.Scanner;

/**
 * Created by Yauheni Krasko on 14.06.2017.
 */
public class Task7DiscriminantCalcDouble {
    public static void main(String[] args) {
        double x,
                x1,
                x2;
        Scanner equation = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = equation.nextDouble();
        System.out.println("Enter b:");
        double b = equation.nextDouble();
        System.out.println("Enter c:");
        double c = equation.nextDouble();

        double d = discriminant(a, b, c);

        if (isPositive(d)) {
            x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            x2 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            System.out.println("Полученные корни уравнения: x1=" + x1 + " x2=" + x2);
        } else if (izZero(d)) {
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень х=" + x);
        } else System.out.println("Уравнение не имеет вещественных корней");
    }

    static double discriminant(double rootA, double rootB, double rootC) {
        double a = rootA;
        double b = rootB;
        double c = rootC;
        double discr = Math.pow(b, 2) - 4 * a * c;
        return discr;
    }

    static boolean isPositive(double d) {
        if (d > 0) {
            return true;
        } else {
            return false;
        }
    }

    static boolean izZero(double d) {
        if (d == 0) {
            return true;
        } else {
            return false;
        }
    }
}
