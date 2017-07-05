package Lesson7;

/**
 * Created by ADMIN on 05.07.2017.
 */
public class Bank {
    public void fulfilOperation(){
        System.out.printf("Operation pending...");
    }

    @Transaction
    public void fulfilTransaction(){
        System.out.println("Transaction performing...");
    }

    public void fulfilCashWithDrowall(){
        System.out.println("Cash withdrawing...");
    }
}
