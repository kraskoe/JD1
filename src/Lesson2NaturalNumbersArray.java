/**
 * Created by User on 14.06.2017.
 */
public class Lesson2NaturalNumbersArray {
    public static void main(String[] args) {
        int[] naturalArray = new int[100];
        int counter = 0;
        int number = 13;

        while (counter < 100) {
            if (number % 13 == 0 || number % 17 == 0) {
                naturalArray[counter] = number;
                counter++;
            }
            number++;
        }

        for (int i = 0; i < naturalArray.length; i++) {
            System.out.print(naturalArray[i] + " ");
        }
    }
}
