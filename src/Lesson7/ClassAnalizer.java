package Lesson7;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by ADMIN on 05.07.2017.
 */
public class ClassAnalizer {
    public static void analyze(Class cl){
        try {
            Constructor[] constructors = cl.getDeclaredConstructors();
            for (Constructor c : constructors){
                System.out.println("Constructor: " + c);
                getAnnos(cl);
            }

            Field[] fields = cl.getDeclaredFields();
            for (Field f : fields){
                System.out.println("Field: " + f);
                getAnnos(cl);
            }

            Method[] methods = cl.getDeclaredMethods();
            for (Method m : methods){
                System.out.println("Method: " + m);
                getAnnos(cl);
            }

            getAnnos(cl);

        //NoSuchMethodException | IllegalAccessException | InvocationTargetException
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void getAnnos(Class cls){
        Annotation[] annos = cls.getDeclaredAnnotations();
        for (Annotation a : annos){
            System.out.println("Annotation: " + a);
        }
    }
}
