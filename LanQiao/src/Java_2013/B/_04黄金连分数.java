package Java_2013.B;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @Author Qiao
 * @Create 2022/3/28 09:50
 */

public class _04黄金连分数 {
    public static void main(String[] args) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;

        for (int i = 3; i < 500; i++) {
            BigInteger t = b;
            b = a.add(b);
            a = t;
        }

        BigDecimal divide = new BigDecimal(a, 110).divide(new BigDecimal(b, 110), BigDecimal.ROUND_HALF_DOWN);
        System.out.println(divide);
    }
}
