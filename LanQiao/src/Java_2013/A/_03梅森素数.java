package Java_2013.A;

import java.math.BigInteger;

/**
 * @Author Qiao
 * @Create 2022/3/20 09:00
 */

//求2^11213-1的最后100位
//数字很大（3000多位），考察BigInteger
public class _03梅森素数 {
    public static void main(String[] args) {
        BigInteger x = BigInteger.valueOf(2).pow(11213).subtract(BigInteger.ONE);
        String result = x.toString();
        System.out.println(result);
        System.out.println(result.substring(result.length()-100));
    }
}
