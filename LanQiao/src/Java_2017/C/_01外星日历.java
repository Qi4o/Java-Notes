package Java_2017.C;

import java.math.BigInteger;

/**
  * @Author Qiao
  * @Create 2022/4/4 22:28
  */

public class _01外星日历 {
    public static void main(String[] args) {
        BigInteger n = new BigInteger("651764141421415346185");
        n = n.mod(BigInteger.valueOf(9));
        System.out.println(n);
    }
}
