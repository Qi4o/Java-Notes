package Java_2017.A;

/**
 * @Author Qiao
 * @Create 2022/4/2 10:32
 */

public class _01迷宫 {
    static String[] arr;
    static int ans;
    static int[][] vis = new int[10][10];
    public static void main(String[] args) {
        arr = new String[10];
        arr[0] = "UDDLUULRUL";
        arr[1] = "UURLLLRRRU";
        arr[2] = "RRUURLDLRD";
        arr[3] = "RUDDDDUUUU";
        arr[4] = "URUDLLRRUU";
        arr[5] = "DURLRLDLRL";
        arr[6] = "ULLURLLRDU";
        arr[7] = "RDLULLRDDD";
        arr[8] = "UUDDUDUDLL";
        arr[9] = "ULRDLUURRR";

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                clr(vis);
                if (dfs(i, j)) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }

    static boolean dfs(int x, int y) {
        if (x < 0 || y < 0 || x > 9 || y > 9) {
            return true;
        }
        if (vis[x][y] == 1) {
            return false;
        }

        vis[x][y] = 1;
        switch (arr[x].charAt(y)) {
            case 'L':
                return dfs(x, y-1);
            case 'R':
                return dfs(x, y+1);
            case 'U':
                return dfs(x-1, y);
            case 'D':
                return dfs(x+1, y);
            default:
                return false;
        }
    }

    static void clr(int[][] vis) {
        for (int i = 0; i < vis.length; i++) {
            for (int j = 0; j < vis[i].length; j++) {
                vis[i][j] = 0;
            }
        }
    }


}
