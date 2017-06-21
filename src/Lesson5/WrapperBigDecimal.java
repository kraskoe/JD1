package Lesson5;

import java.math.BigDecimal;

/**
 * Created by User on 21.06.2017.
 */
public class WrapperBigDecimal {
    BigDecimal unifiedA;
    BigDecimal unifiedB;

    public WrapperBigDecimal(long a, long b) {
        Long firstArgument = a;
        Long secondArgument = b;
        unifiedA = new BigDecimal(firstArgument.toString());
        unifiedB = new BigDecimal(secondArgument.toString());
    }

    public WrapperBigDecimal(long a, double b) {
        Long firstArgument = a;
        Double secondArgument = b;
        unifiedA = new BigDecimal(firstArgument.toString());
        unifiedB = new BigDecimal(secondArgument.toString());
    }

    public WrapperBigDecimal(double a, long b) {
        Double firstArgument = a;
        Long secondArgument = b;
        unifiedA = new BigDecimal(firstArgument.toString());
        unifiedB = new BigDecimal(secondArgument.toString());
    }

    public WrapperBigDecimal(double a, double b) {
        Double firstArgument = a;
        Double secondArgument = b;
        unifiedA = new BigDecimal(firstArgument.toString());
        unifiedB = new BigDecimal(secondArgument.toString());
    }

    public BigDecimal addUnified() {
        return unifiedA.add(unifiedB).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public BigDecimal subtractUnified() {
        return unifiedA.subtract(unifiedB).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public BigDecimal divideUnified() {
        return unifiedA.divide(unifiedB).setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    public BigDecimal multiplyUnified() {
        return unifiedA.multiply(unifiedB).setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
