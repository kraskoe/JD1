import java.util.Scanner;

/**
 * Created by Yauheni Krasko on 13.06.2017.
 */
public class task1CompareWords {
    public static void main(String[] args) {

        Scanner wordsIn = new Scanner(System.in);
        System.out.println("Enter the first word:");
        String firstWord = wordsIn.nextLine();
        System.out.println("Enter the second word:");
        String secondWord = wordsIn.nextLine();
        if (firstWord.equals(secondWord)) {
            System.out.println("Excellent! The words are identical");
        } else if (firstWord.equalsIgnoreCase(secondWord)) {
            System.out.println("OK! They are almost identical");
        } else if (firstWord.length() == secondWord.length()) {
            System.out.println("At least they have equal length");
        } else System.out.println(":(");
    }
}
