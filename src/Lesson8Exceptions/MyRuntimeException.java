package Lesson8Exceptions;

/**
 * Created by User on 03.07.2017.
 */
public class MyRuntimeException extends RuntimeException {
    private String exceptionDescription;

    MyRuntimeException(String s){
        exceptionDescription = s;
    }

    public String toString(){
        return exceptionDescription + ": this is my exception";
    }

    public static void throwMyRuntimeException() throws MyRuntimeException {
        throw new MyRuntimeException("System failure");
    }
}
