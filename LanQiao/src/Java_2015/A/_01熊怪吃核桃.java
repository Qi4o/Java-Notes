package Java_2015.A;

/**
 * @Author Qiao
 * @Create 2022/4/8 16:15
 */

public class _01熊怪吃核桃 {
    public static void main(String[] args) {
        int ans = 0;
        int n = 1543;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n-=1;
                ans++;
            }
        }

        System.out.println(ans);
    }
}
