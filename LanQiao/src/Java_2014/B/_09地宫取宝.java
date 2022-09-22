package Java_2014.B;

import java.util.Scanner;

/**
 * @Author Qiao
 * @Create 2022/4/1 09:36
 */

public class _09地宫取宝 {
    static int n;
    static int m;
    static int k;
    static int[][] arr;
    static long ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }


        dfs(0, 0, -1, 0);

        System.out.println(ans);
    }

    static void dfs(int x, int y, int max, int cnt){
        if (x==n || y==m) {
            return;
        }

        int cur = arr[x][y];

        if (x == n-1 && y == m-1) {
            if ((cnt == k) || (cur > max && cnt == k-1)) {
                ans++;
            }
        }


        if (cur > max) {    //可以取这个物品
            dfs(x+1, y, cur, cnt+1);
            dfs(x, y+1, cur, cnt+1);
        }

        //对于价值较小，或者价值大但不去取的情况
        dfs(x+1, y, max, cnt);
        dfs(x, y+1, max, cnt);
    }
}
