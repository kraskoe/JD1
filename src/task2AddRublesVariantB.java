import java.util.Scanner;

/**
 * Created by Yauheni Krasko on 13.06.2017.
 */
public class task2AddRublesVariantB {
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
        String rublesString = Integer.toString(rublesSum);

//        switch (rublesString.length()) {
//            case 1:
//                switch (Character.getNumericValue(rublesString.charAt(rublesString.length()-1))
//        }
    }
}




//        if (rublesString.length() == 1) {
//            if (Character.getNumericValue(rublesString.charAt(rublesString.length()-1)) == 0 ||
//                    (Character.getNumericValue(rublesString.charAt(rublesString.length()-1)) >= 5 &&
//                            Character.getNumericValue(rublesString.charAt(rublesString.length()-1)) <= 9)) {
//                System.out.println("Ваша сумма: " + rublesSum + " рублей");
//            } else if (Character.getNumericValue(rublesString.charAt(rublesString.length()-1)) == 1) {
//                System.out.println("Ваша сумма: " + rublesSum + " рубль");
//            } else if (Character.getNumericValue(rublesString.charAt(rublesString.length()-1)) >= 2 &&
//                    Character.getNumericValue(rublesString.charAt(rublesString.length()-1)) <= 4) {
//                System.out.println("Ваша сумма: " + rublesSum + " рубля");
//            }
//        } else if (Character.getNumericValue(rublesString.charAt(rublesString.length()-2)) == 1) {
//            System.out.println("Ваша сумма: " + rublesSum + " рублей");
//        } else if (Character.getNumericValue(rublesString.charAt(rublesString.length()-1)) == 0 ||
//                (Character.getNumericValue(rublesString.charAt(rublesString.length()-1)) >= 5 &&
//                        Character.getNumericValue(rublesString.charAt(rublesString.length()-1)) <= 9)) {
//            System.out.println("Ваша сумма: " + rublesSum + " рублей");
//        } else if (Character.getNumericValue(rublesString.charAt(rublesString.length()-1)) == 1) {
//            System.out.println("Ваша сумма: " + rublesSum + " рубль");
//        } else if (Character.getNumericValue(rublesString.charAt(rublesString.length()-1)) >= 2 &&
//                Character.getNumericValue(rublesString.charAt(rublesString.length()-1)) <= 4) {
//            System.out.println("Ваша сумма: " + rublesSum + " рубля");
//        }

