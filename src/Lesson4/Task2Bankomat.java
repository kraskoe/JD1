package Lesson4;

/**
 * Created by User on 17.06.2017.
 */
public class Task2Bankomat {
    public static void main(String[] args) {
        Bankomat myBankomat = new Bankomat(29, 45, 90);

        myBankomat.push20Bucks(5);
        myBankomat.push50Bucks(10);
        myBankomat.push100Bucks(15);

        myBankomat.getMoney();
    }
}
