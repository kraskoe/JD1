package Lesson8Exceptions;

import java.util.Random;

/**
 * Created by User on 03.07.2017.
 */
public class TestExceptions {
    public static void main(String[] args) {

        //Task 1 NPE
        System.out.println("Task #1");

        try {
            Double testDouble = null;
            testDouble.doubleValue();
        } catch (NullPointerException npe) {
            System.out.println(npe + " (Pointer references to NULL)");
        } finally {
            System.out.println("");
        }

        //Task 2 Array Index Out of Bounds
        System.out.println("Task #2");

        try {
            int testArray[] = {1, 2, 3};
            testArray[5] = 7;
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println(aie + " (Attempt of reference to unexisting index of array)");
        } finally {
            System.out.println("");
        }

        //Task 3 My exception + stacktrace
        System.out.println("Task #3");

        try {
            MyException.throwMyException();
        } catch (MyException me) {
            System.out.println(me.toString());
            System.out.println(me.getStackTrace());
            //???
//            me.printStackTrace();
        } finally {
            System.out.println("");
        }

        //Task 4 My exception - runtime exception
        System.out.println("Task #4");

        try {
            MyRuntimeException.throwMyRuntimeException();
        } catch (MyRuntimeException me) {
            System.out.println(me.toString());
            System.out.println(me.getStackTrace());
        } finally {
            System.out.println("");
        }

        //Task 5 Exception causes exception
        System.out.println("Task #5");

        try {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException ae) {
                MyException me = new MyException();
                me.initCause(ae);
                throw me;
            }
        } catch (MyException me) {
            System.out.println(me.toString());
            System.out.println("Cause of exception: " + me.getCause());
            System.out.println(me.getStackTrace()); //???
        } finally {
            System.out.println("");
        }

        //Task 6 Method throws random exception
        System.out.println("Task #6");

        try {
            getRandomException();
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic exception: " + ae.toString());
        } catch (IllegalArgumentException ie) {
            System.out.println("Illegal argument exception: " + ie.toString());
        } catch (UnsupportedOperationException ue) {
            System.out.println("Unsupported operation exception: " + ue.toString());
        } catch (Exception e){
            System.out.println("Common compilation exception: " + e.toString());
        }finally {
        System.out.println("");
    }

        //Task 7 Method throws 50% random exception
        System.out.println("Task #7");

        try {
            get50RandomException();
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        } finally {
        System.out.println("Program terminated");
        }
    }

    public static void getRandomException() throws Exception{
        Random rand = new Random();
        int randomNumber = rand.nextInt(101);
        if (randomNumber < 33) {
            throw new ArithmeticException();
        } else if (randomNumber < 66) {
            throw new IllegalArgumentException();
        } else throw new UnsupportedOperationException();
    }

    public static void get50RandomException() throws Exception{
        Random rand = new Random();
        int randomNumber = rand.nextInt(101);
        if (randomNumber <= 50) {
            throw new Exception();
        } else System.out.println("Program works correctly");
    }
}
