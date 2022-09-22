package Java_2017.A;

/**
 * @Author Qiao
 * @Create 2022/4/2 17:26
 */
    //错的 不会
public class _04方格分割 {
    static int[][] arr = new int[6][6];
    static int[][] vis = new int[6][6];
    static int ans;
    static int temp;
    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            temp = 0;
            clr(vis);
            dfs(i, 0);
        }

        System.out.println(ans);
    }

    static void dfs(int x, int y) {
        if (x < 0 || x > 5 || y < 0 || y > 5 || vis[x][y] == 1) {
            return;
        }

        temp += 1;
        vis[x][y] = 1;
        if (temp == 18) {
            ans++;
            return;
        }

        dfs(x-1, y);
        dfs(x+1, y);
        dfs(x, y-1);
        dfs(x, y+1);

    }

    static void clr(int[][] vis) {
        for (int i = 0; i < vis.length; i++) {
            for (int j = 0; j < vis[i].length; j++) {
                vis[i][j] = 0;
            }
        }
    }
}
