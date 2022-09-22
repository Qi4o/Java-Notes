package Java_2017.A;

import java.util.Scanner;

/**
 * @Author Qiao
 * @Create 2022/4/3 21:57
 */

public class _10油漆面积 {
    static int[][] arr;
    static int[][] map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new int[n][4];
        arr = new int[10000][10000];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int a,b,c,d;
        for (int i = 0; i < map.length; i++) {
            a = map[i][0];
            b = map[i][1];
            c = map[i][2];
            d = map[i][3];

            for (int j = a; j < c; j++) {
                for (int k = b; k < d; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1){
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
