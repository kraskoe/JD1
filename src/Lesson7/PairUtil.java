package Lesson7;

/**
 * Created by User on 02.07.2017.
 */
public final class PairUtil {
    public static <K, V> Pair swap(Pair pair){
        K tempK = (K) pair.getFirstValue();
        V tempV = (V) pair.getSecondValue();
        Pair <V, K> swapPair = new Pair <> (tempV,tempK);
        return swapPair;
    }
}
