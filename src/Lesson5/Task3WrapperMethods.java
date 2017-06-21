package Lesson5;


/**
 * Created by User on 21.06.2017.
 */
public class Task3WrapperMethods {
    public static void main(String[] args) {
        WrapperBigDecimal newWrapper1 = new WrapperBigDecimal(3.9, 3.2);
        System.out.println(newWrapper1.addUnified());
        System.out.println(newWrapper1.divideUnified());

        WrapperBigDecimal newWrapper2 = new WrapperBigDecimal(2, 1.1);
        System.out.println(newWrapper2.subtractUnified());
        System.out.println(newWrapper2.multiplyUnified());
    }
}
