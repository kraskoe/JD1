/**
 * Created by User on 14.06.2017.
 */
public class Lesson2SumOfElementsBetweenMinAndMax {
    public static void main(String[] args) {

        int[] predefinedArray = {5, 9, 13, 7, 16, 8, 2, 9, 35, 47};
        int min = predefinedArray[0];
        int max = predefinedArray[0];
        int minIndex = 0;
        int maxIndex = 0;
        int sum = 0;

        for (int i = 1; i < predefinedArray.length; i++) {
            if (predefinedArray[i] < min) {
                min = predefinedArray[i];
                minIndex = i;
            } else if (predefinedArray[i] > max) {
                max = predefinedArray[i];
                maxIndex = i;
            }
        }

        if (minIndex < maxIndex) {
            for (int i = minIndex + 1; i < maxIndex; i++) {
                sum += predefinedArray[i];
            }
        } else {
            for (int i = maxIndex + 1; i < minIndex; i++) {
                sum += predefinedArray[i];
            }
        }

        System.out.println("Сумма равна:" + sum);
    }
}
