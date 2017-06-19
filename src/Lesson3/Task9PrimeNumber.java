package Lesson3;

/**
 * Created by User on 19.06.2017.
 */
public class Task9PrimeNumber {
    public static void main(String[] args) {
        int numberForCheck = 15;
        boolean flag = true;
        for (int i = 2; i < numberForCheck; i++){
            if (numberForCheck % i == 0){
                flag = false;
            }
        }

        System.out.println(flag ? "The number is prime" : "The number is not prime");
    }
}
