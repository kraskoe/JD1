import java.util.Random;

/**
 * Created by User on 15.06.2017.
 */
public class Lesson4RandomCardsArray {
    public static void main(String[] args) {
        String[] playingCardsArray = new String[52];
        String[] cardsArray = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] suitsArray = {"Hearts", "Spades", "Clubs", "Diamonds"};
        int counter =0;

        for (int i = 0; i < 13; i++){
            for (int j = 0; j < 4; j++){
                playingCardsArray[counter] = cardsArray[i] + "Of" + suitsArray[j];
                counter++;
            }
        }

        for (int i = 0; i < playingCardsArray.length; i++){
            System.out.print(playingCardsArray[i] + " ");
        }

        shuffleCardsArray(playingCardsArray);
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < playingCardsArray.length; i++){
            System.out.println(playingCardsArray[i]);
        }


//        String[] testArray = {"hi", "there", "my", "name", "is", "Ugin"};
//        for (int i = 0; i < testArray.length; i++){
//            System.out.print(testArray[i] + " ");
//        }
//
//        shuffleCardsArray(testArray);
//
//        System.out.println("");
//        for (int i = 0; i < testArray.length; i++){
//            System.out.print(testArray[i] + " ");
//        }


    }

    static void shuffleCardsArray(String[] array){
        Random shuffle = new Random();
        for (int i = array.length-1; i >= 0; i--){
            int index = shuffle.nextInt(i + 1);
            String a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
    }
}
