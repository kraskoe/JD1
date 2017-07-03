package Lesson7;

import java.lang.annotation.*;

/**
 * Created by User on 03.07.2017.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface Transaction {
}
