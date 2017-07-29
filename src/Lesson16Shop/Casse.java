package Lesson16Shop;

/**
 * Created by User on 29.07.2017.
 */
public abstract class Casse {
    public static void serve(Customer customer){
        int totalSum = 0;
        while (!(customer.cBusket.basket.isEmpty())){
            for (Good g : customer.cBusket.basket){
                totalSum += g.getPrice();
            }
        }
        customer.setCash(customer.getCash() - totalSum);
        System.out.printf("Общая стоимость товаров в корзине покупателя" + customer.getName() + ": " + totalSum +"%n"
               + "Покупатель " + customer.getName() + " оплатил товар%n"
        + "У покупателя " + customer.getName() + " осталось денег: " + customer.getCash() + "%n"
        + "Покупатель " + customer.getName() + " вышел из магазина%n");
    }
}
