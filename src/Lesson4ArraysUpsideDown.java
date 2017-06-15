/**
 * Created by User on 14.06.2017.
 */
public class Lesson4ArraysUpsideDown {
    public static void main(String[] args) {
        int[] arrayUpsideDown = {5, 9, 13, 7, 16, 8, 2};

        for (int i = 0; i < arrayUpsideDown.length; i++) {
            System.out.print(arrayUpsideDown[i] + " ");
        }

        System.out.println("");

        for (int i = arrayUpsideDown.length - 1; i >= 0; i--) {
            System.out.print(arrayUpsideDown[i] + " ");
        }
    }
}
