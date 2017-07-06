package Lesson7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by User on 02.07.2017.
 */
public class TestLesson7 {
    public static void main(String[] args) {
        //Task 1,2 Pair - swap pair
        System.out.println("Task 1, 2 Pair object");
        Pair <Double, Integer> pairA = new Pair <>(new Double("2.1"), new Integer(5));
        System.out.println(pairA.toString());
        Pair <Integer, Double> pairB = PairUtil.swap(pairA);
        System.out.println(pairB.toString());

        //Task 4 Calculator with generics
        Double a = new Double("5.19");
        Integer b = 7;
        double c = 3.4;
        int d = 9;

        System.out.println("");
        System.out.println("Task 4 Calculator");
        Calculator <Number> newWrapper1 = new Calculator <>(3.9, 3.2);
        System.out.println(newWrapper1.addUnified());
        System.out.println(newWrapper1.divideUnified());

        Calculator <Number> newWrapper2 = new Calculator <>(2, 1.1);
        System.out.println(newWrapper2.subtractUnified());
        System.out.println(newWrapper2.multiplyUnified());

        Calculator <Number> newWrapper3 = new Calculator <>(a, b);
        System.out.println(newWrapper3.subtractUnified());
        System.out.println(newWrapper3.multiplyUnified());

        Calculator <Number> newWrapper4 = new Calculator <>(c, d);
        System.out.println(newWrapper4.subtractUnified());
        System.out.println(newWrapper4.multiplyUnified());

        //Task 5 Transaction annotation
        System.out.println("");
        System.out.println("Task 5 Transaction");
        try {
            Bank bank = new Bank();
            Class bankClass = bank.getClass();
            Method[] bankMethods = bankClass.getDeclaredMethods();
            for (Method m : bankMethods){
                if(m.isAnnotationPresent(Transaction.class)){
                    Transaction trans = m.getAnnotation(Transaction.class);
                    System.out.println(trans.start);
                    bank.fulfilTransaction();
                    m.invoke(bank);
                    System.out.println(trans.end);
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
