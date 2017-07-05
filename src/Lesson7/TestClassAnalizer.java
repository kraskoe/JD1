package Lesson7;

import static Lesson7.ClassAnalizer.*;

/**
 * Created by ADMIN on 05.07.2017.
 */
public class TestClassAnalizer {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Class bankClass = bank.getClass();

        ClassAnalizer.analyze(bankClass);
    }
}
