package Lesson16Shop;

/**
 * Created by User on 29.07.2017.
 */
public enum Good {
    BEER(17, "пиво"),
    VODKA(40, "водка"),
    SNACKS(13, "чипсы"),
    BREAD(9, "хлеб"),
    MILK(7, "молоко"),
    WHITE_BREAD(8, "батон"),
    FISH(38, "рыба"),
    SAUSAGES(43, "колбаски"),
    CAKE(15, "пирог");

    private int price;
    private String value;
    Good(int p, String n){
        price = p;
        value = n;
    }

    public int getPrice(){
        return price;
    }
    public String getValue(){
        return value;
    }
}
