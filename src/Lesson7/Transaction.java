package Lesson7;

import java.lang.annotation.*;

/**
 * Created by User on 03.07.2017.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Transaction {
    String start = "Transaction start";
    String end = "Transaction ended";
}
