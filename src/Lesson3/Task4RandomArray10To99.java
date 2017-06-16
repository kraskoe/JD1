package Lesson3;

/**
 * Created by User on 15.06.2017.
 */
public class Task4RandomArray10To99 {
    public static void main(String[] args) {
        int randomArray[] = new int[4];
        boolean flag = true;

        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = random10To99();
        }

        for (int i = 0; i < randomArray.length; i++){
            System.out.print(randomArray[i] + " ");
        }

        for (int i = 1; i < randomArray.length; i++){
            if (randomArray[i] <= randomArray[i - 1]){
                flag = false;
            }
        }

        if (flag == true){
            System.out.println("Последовательность элементов массива возрастающая");
        } else System.out.println("Последовательность элементов массива не строго возрастающая");
    }

    static int random10To99(){
        return (int) (Math.random() * 90 + 10);
    }
}
