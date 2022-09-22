package Java_2017.A;

import java.util.Scanner;

/**
 * @Author Qiao
 * @Create 2022/4/3 15:11
 */

public class _09分巧克力 {
    static int[][] arr;
    static int n;
    static int k;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int r = 100001;
        int l = 1;
        int ans = 0;
        while (l <= r) {       //二分查找优化
            int mid = (l+r) / 2;

            if (f(mid) > k) {
                l = mid + 1;
                ans = mid;
            } else {
                r = mid-1;
            }
        }

        System.out.println(ans);
    }

    static int f(int t){
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = arr[i][0] - (arr[i][0] % t);
            int y = arr[i][1] - (arr[i][1] % t);

            //ans += x*y/(t*t);

            ans += (arr[i][0]/t) * (arr[i][1]/t);
        }
        return ans;
    }
}
