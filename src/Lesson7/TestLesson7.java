package Lesson7;

/**
 * Created by User on 02.07.2017.
 */
public class TestLesson7 {
    public static void main(String[] args) {
        Pair pairA = new Pair(new Double("2.1"), new Integer(5));
        System.out.println(pairA.toString());
        Pair pairB = PairUtil.swap(pairA);
        System.out.println(pairB.toString());

    }
}
