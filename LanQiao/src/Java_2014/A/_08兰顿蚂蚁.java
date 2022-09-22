package Java_2014.A;

import java.util.Scanner;

/**
 * @Author Qiao
 * @Create 2022/3/30 20:02
 */

public class _08兰顿蚂蚁 {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();   //行号
        int y = sc.nextInt();   //列号

        String s = sc.next();   //动作
        int k = sc.nextInt();   //步数

        move(x, y, s, k);




    }

    public static void move(int x, int y, String s, int k) {
        if (k == 0) {
            System.out.println(x + " " + y);
            return;
        }
        if (arr[x][y] == 1){
            arr[x][y] = 0;
            if (s.equals("U")) {
                s = "R";
            } else if (s.equals("R")) {
                s = "D";
            } else if (s.equals("D")) {
                s = "L";
            } else if (s.equals("L")) {
                s = "U";
            }
        } else {
            arr[x][y] = 1;
            if (s.equals("U")) {
                s = "L";
            } else if (s.equals("L")) {
                s = "D";
            } else if (s.equals("D")) {
                s = "R";
            } else if (s.equals("R")) {
                s = "U";
            }
        }

        if (s.equals("U")) {
            x--;
        } else if (s.equals("D")) {
            x++;
        } else if (s.equals("L")) {
            y--;
        }else if (s.equals("R")) {
            y++;
        }

        k--;

        move(x, y, s, k);
    }
}
