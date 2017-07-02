package Lesson7;


/**
 * Created by User on 21.06.2017.
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Double a = new Double("5.19");
        Integer b = 7;
        double c = 3.4;
        int d = 9;


        Calculator newWrapper1 = new Calculator(3.9, 3.2);
        System.out.println(newWrapper1.addUnified());
        System.out.println(newWrapper1.divideUnified());

        Calculator newWrapper2 = new Calculator(2, 1.1);
        System.out.println(newWrapper2.subtractUnified());
        System.out.println(newWrapper2.multiplyUnified());
    }
}
