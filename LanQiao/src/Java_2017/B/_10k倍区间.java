package Java_2017.B;

import java.util.Scanner;

/**
 * @Author Qiao
 * @Create 2022/4/4 21:40
 */

public class _10k倍区间 {
    static int ans;
    static int[] arr;
    static int tempSum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            tempSum = 0;
            for (int j = i; j < n; j++) {
                tempSum+=arr[j];
                if (tempSum % k == 0) {
                    ans++;
                }
            }
            tempSum = 0;
        }

        System.out.println(ans);

    }
}
