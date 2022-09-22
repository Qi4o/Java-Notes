package Java_2017.C;

import java.util.Scanner;

/**
 * @Author Qiao
 * @Create 2022/4/6 10:24
 */

public class _09青蛙跳杯子 {
    static String start;
    static String res;
    static int ans = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        start = sc.next();
        res = sc.next();


        for (int i = 0; i < start.length(); i++) {
            f(i, start.length(), start, 0);
        }

        System.out.println(ans);
    }

    static void f(int x, int y, String str, int temp){
        if (str.equals(res)) {
            ans = Math.min(ans, temp);
            return;
        }

        if (x==y) {
            return;
        }

        if (y - x >= 2){
            char[] t = str.toCharArray();
            char tc = t[x];
            t[x] = t[x+1];
            t[x+1] = tc;
            temp++;
            f(x+1,y, new String(t), temp);
            temp--;
        }

        if (y - x >= 3) {
            char[] t = str.toCharArray();
            char tc = t[x];
            t[x] = t[x+2];
            t[x+2] = tc;
            temp++;
            f(x+2,y, new String(t), temp);
            temp--;
        }

        if (y - x >= 4) {
            char[] t = str.toCharArray();
            char tc = t[x];
            t[x] = t[x+3];
            t[x+3] = tc;
            temp++;
            f(x+3, y, new String(t), temp);
            temp--;
        }
    }
}
