package Practice;

/**
 * Created by User on 21.06.2017.
 */
public class PassengerCar extends Car {

    String speed = "Passenger Practice.Car Speed = 90";
    @Override
    public void move() {
        System.out.println("I move fast");
    }

    static void moveStatic() {
        System.out.println("Static Passenger car");
    }
}
