package Java_2017.A;

import java.util.Scanner;

/**
 * @Author Qiao
 * @Create 2022/4/3 11:09
 */

public class _07正则问题 {
    static String arr;
    static int index;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = sc.next();
        System.out.println(f());
    }

    static int f() {
        int m = 0;
        int temp = 0;
        while (index < arr.length()) {
            if (arr.charAt(index) == '(') {
                index++;
                temp += f();
            } else if (arr.charAt(index) == 'x') {
                index++;
                temp++;
            } else if (arr.charAt(index) == '|') {
                index++;
                m = Math.max(m, temp);
                temp = 0;
            } else if (arr.charAt(index) == ')') {
                index++;
                m = Math.max(m, temp);
                return m;
            }
        }
        m = Math.max(m, temp);
        return m;
    }
}
