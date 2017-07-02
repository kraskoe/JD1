package Lesson3;

import java.util.Random;

/**
 * Created by User on 15.06.2017.
 */
public class Task7RandomCardFromDeck {
    public static void main(String[] args) {
        String randomCard = new String();

        switch (randomCard()) {
            case 0:
                randomCard += "Ace";
                break;
            case 1:
                randomCard += "2";
                break;
            case 2:
                randomCard += "3";
                break;
            case 3:
                randomCard += "4";
                break;
            case 4:
                randomCard += "5";
                break;
            case 5:
                randomCard += "6";
                break;
            case 6:
                randomCard += "7";
                break;
            case 7:
                randomCard += "8";
                break;
            case 8:
                randomCard += "9";
                break;
            case 9:
                randomCard += "Jack";
                break;
            case 10:
                randomCard += "Queen";
                break;
            case 11:
                randomCard += "King";
                break;
        }

        switch (randomSuit()) {
            case 0:
                randomCard += "OfHearts";
                break;
            case 1:
                randomCard += "OfSpades";
                break;
            case 2:
                randomCard += "OfClubs";
                break;
            case 3:
                randomCard += "OfDiamonds";
                break;
        }

        System.out.println(randomCard);
    }

    static int randomCard() {
        final Random randomNumber = new Random();
        return randomNumber.nextInt(12);
    }

    static int randomSuit() {
        final Random randomNumber = new Random();
        return randomNumber.nextInt(4);
    }
}
