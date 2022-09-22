package Java_2013.C;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Qiao
 * @Create 2022/3/29 22:30
 */

//年龄的立方是个四位数，四次方是个六位数，这10个数字正好包含了从0到9这10个数字，每个都恰好出现一次

public class _01猜年龄 {
    public static void main(String[] args) {
//        for (int i = 10; i < 100; i++) {
//            if (isFour(i*i*i)) {
//                if (isSix(i*i*i*i)) {
//                    if (test(i*i*i, i*i*i*i)) {
//                        System.out.println(i);
//                        break;
//                    }
//                }
//            }
//        }

        for (int i = 10; i < 100; i++) {
            int i1 = i*i*i;
            int i2 = i1*i;
            String s1 = i1+"";
            String s2 = i2+"";
            String s = s1+s2;
            if (s1.length() == 4 && s2.length() == 6 && check(s)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean isFour(int i) {
        return i / 1000 >= 1 && i / 1000 < 10;
    }

    public static boolean isSix(int i) {
        return i / 100000 >= 1 && i / 100000 < 10;
    }

    public static boolean test(int a, int b) {
        String str = "" + a + b;
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (str.contains(i+"")) {
                count++;
            }
        }
        return count == 10;
    }

    public static boolean check(String s) {
        Set set = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size() == 10;
    }

}
