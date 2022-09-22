package Java_2016.A;

/**
 * @Author Qiao
 * @Create 2022/4/6 11:40
 */

public class _01煤球数目 {
    public static void main(String[] args) {
        int ans = 1;
        int sum = 1;
        for (int i = 2; i < 101; i++) {
            ans+=i;
            sum += ans;
        }
        System.out.println(sum);
    }
}
