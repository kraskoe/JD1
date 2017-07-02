package Lesson7;

import java.math.BigDecimal;

/**
 * Created by User on 21.06.2017.
 */
public class Calculator <T> {
    BigDecimal unifiedA;
    BigDecimal unifiedB;


    public Calculator(T a, T b) {
        unifiedA = new BigDecimal(a.toString());
        unifiedB = new BigDecimal(b.toString());
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
