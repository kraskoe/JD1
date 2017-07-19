package Lesson14LambdaStream;


/**
 * Created by ADMIN on 19.07.2017.
 */
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;

    public Person (String f, String l, int a){
        firstName = f;
        lastName = l;
        age = a;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Integer getAge(){
        return age;
    }
}
