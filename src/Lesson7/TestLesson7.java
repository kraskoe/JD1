package Lesson7;

/**
 * Created by User on 02.07.2017.
 */
public class TestLesson7 {
    public static void main(String[] args) {
        Pair <Double, Integer> pairA = new Pair <>(new Double("2.1"), new Integer(5));
        System.out.println(pairA.toString());
        Pair <Integer, Double> pairB = PairUtil.swap(pairA);
        System.out.println(pairB.toString());


    }
}
