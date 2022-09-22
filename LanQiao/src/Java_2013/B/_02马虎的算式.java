package Java_2013.B;

/**
 * @Author Qiao
 * @Create 2022/3/28 09:39
 */

public class _02马虎的算式 {
    public static void main(String[] args) {
        int n1,n2,n3,n4,count = 0;
        for (int a = 1; a < 10; a++) {
            for (int b = 1; b < 10; b++) {
                if(a!=b)for (int c = 1; c < 10; c++){
                    if(a!=c && b!=c)for (int d = 1; d < 10; d++) {
                        if(a!=d && b!=d && c!=d)for (int e = 1; e < 10; e++){
                            if(a!=e && b!=e && c!=e && d!=e) {
                                n1 = Integer.parseInt("" + a + b);
                                n2 = Integer.parseInt("" + c + d + e);
                                n3 = Integer.parseInt("" + a + d + b);
                                n4 = Integer.parseInt("" + c + e);
                                if (n1 * n2 == n3 * n4) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
