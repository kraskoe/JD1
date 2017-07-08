package Lesson7;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by ADMIN on 05.07.2017.
 */
public class ClassAnalizer {
    public static void analyze(Object obj){
        analyze(obj.getClass());
    }

    public static void analyze(Class cl){
        try {
            Constructor[] constructors = cl.getDeclaredConstructors();
            for (Constructor c : constructors){
                System.out.println("Constructor: " + c);
                getAnnos(c);
            }

            Field[] fields = cl.getDeclaredFields();
            for (Field f : fields){
                System.out.println("Field: " + f);
                getAnnos(f);
            }

            Method[] methods = cl.getDeclaredMethods();
            for (Method m : methods){
                System.out.println("Method: " + m);
                getAnnos(m);
            }

            getAnnos(cl);

        //NoSuchMethodException | IllegalAccessException | InvocationTargetException
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void getAnnos(Class cl){
        Annotation[] annos = cl.getDeclaredAnnotations();
        for (Annotation a : annos){
            System.out.println("Annotation: " + a);
        }
    }

    public static void getAnnos(Constructor c){
        Annotation[] annos = c.getDeclaredAnnotations();
        for (Annotation a : annos){
            System.out.println("Annotation: " + a);
        }
    }

    public static void getAnnos(Field f){
        Annotation[] annos = f.getDeclaredAnnotations();
        for (Annotation a : annos){
            System.out.println("Annotation: " + a);
        }
    }

    public static void getAnnos(Method m){
        Annotation[] annos = m.getDeclaredAnnotations();
        for (Annotation a : annos){
            System.out.println("Annotation: " + a);
        }
    }
}
