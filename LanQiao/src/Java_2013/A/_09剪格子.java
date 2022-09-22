package Java_2013.A;

import java.util.Scanner;

/**
 * @Author Qiao
 * @Create 2022/3/24 18:35
 */

//最少的格子

public class _09剪格子 {
    static int[][] g;
    static int[][] vis;
    static int n;
    static int m;
    static int total = 0;
    static int ans = Integer.MAX_VALUE;


    public static void main(String[] args) {
        //m表示宽度，n表示高度
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        g = new int[n][m];
        vis = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                g[i][j] = sc.nextInt();
                total += g[i][j];
            }
        }

        dfs(0,0,0,0);
        System.out.println(ans);
    }

    public static void dfs(int i, int j, int steps, int sum){
        if (i<0 || i==n || j<0 || j==m || vis[i][j]==1) return;
        if (sum == total / 2) {
            ans = Math.min(ans, steps);
            return;
        }
        if (sum > total / 2) return;

        vis[i][j] = 1;

        dfs(i+1, j, steps + 1, sum + g[i][j]);
        dfs(i-1, j, steps + 1, sum + g[i][j]);
        dfs(i, j + 1, steps + 1, sum + g[i][j]);
        dfs(i, j - 1, steps + 1, sum + g[i][j]);

        vis[i][j] = 0;
    }
}
