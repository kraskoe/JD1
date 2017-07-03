package Lesson8Exceptions;

/**
 * Created by User on 03.07.2017.
 */
public class MyException extends Exception {
    private String exceptionDescription;

    MyException(){};

//    MyException(String s){
//        exceptionDescription = s;
//    }
//
//    public String toString(){
//        return exceptionDescription + ": this is my exception";
//    }

    public static void throwMyException() throws MyException{
        throw new MyException();
    }
}
