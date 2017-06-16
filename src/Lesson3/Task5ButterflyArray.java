package Lesson3;

/**
 * Created by User on 15.06.2017.
 */
public class Task5ButterflyArray {
    public static void main(String[] args) {
        int butterflyArray[][] = new int[5][5];

//        for (int i = 0; i < butterflyArray.length; i++){
//            for (int j = 0; j < butterflyArray[0].length; j++){
//                butterflyArray[i][j] = 0;
//            }
//        }

        for (int i = 0; i < butterflyArray.length / 2; i++){
            for (int j = i; j < butterflyArray[0].length - i; j++){
                butterflyArray[i][j] = 1;
            }
        }

        for (int i = butterflyArray.length / 2; i < butterflyArray.length; i++){
            for (int j = butterflyArray[0].length - 1 - i; j <= i; j++){
                butterflyArray[i][j] = 1;
            }
        }

        for (int i = 0; i < butterflyArray.length; i++){
            for (int j = 0; j < butterflyArray[0].length; j++){
                switch (butterflyArray[i][j]){
                    case 0:
                        System.out.print("  ");
                        break;
                    case 1:
                        System.out.print("* ");
                        break;
                }
            }
            System.out.println();
        }

    }
}
