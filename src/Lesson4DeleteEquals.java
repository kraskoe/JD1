import java.util.Arrays;

/**
 * Created by Yauheni Krasko on 16.06.2017.
 */
public class Lesson4DeleteEquals {
    public static void main(String[] args) {
        int intArrayRepeatingNumbers[] = {15, 7, 90, 21, 37, 42, 84, 15, 21, 16,21, 72};

        deleteRepeatingNumbersFromArray(intArrayRepeatingNumbers);
    }

    static void deleteRepeatingNumbersFromArray(int array[]){
        int counter = 1;

        for (int i = 0; i < array.length - counter; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[j] == array[i]){
                    for (int k = j; k < array.length - counter; k++){
                        array[k] = array[k + 1];
                    }
                    counter++;
                }
            }
        }

        int intArrayWithoutRepeatingNumbers[] = Arrays.copyOf(array, array.length + 1 - counter);
        for (int i : intArrayWithoutRepeatingNumbers){
            System.out.print(i + " ");
        }
    }
}
