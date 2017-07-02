package Lesson3;

/**
 * Created by User on 19.06.2017.
 */
public class Task10Factorial {
    public static void main(String[] args) {
        int numberForFactorial = 10;
        long factorial1 = 1, factorial2 = 1;

        for (int i = 1; i <= numberForFactorial; i++) {
            factorial1 *= i;
        }

        System.out.println(factorial1);

        int i = numberForFactorial;
        while (i > 0) {
            factorial2 *= i--;
        }

        System.out.println(factorial2);
    }
}
