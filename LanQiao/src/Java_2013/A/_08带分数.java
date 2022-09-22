package Java_2013.A;

import java.util.Scanner;

/**
 * @Author Qiao
 * @Create 2022/3/23 15:33
 */

//不会

//100 = 3 + 69258 / 714
//100 = 82 + 3546 / 197
//1~9分别出现且只出现一次(不包含0)
//类似这样的带分数， 100有11种表示法

//输入一个正整数
//输出该数字带分数的数量，统计有多少种表示法

public class _08带分数 {
    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9};
//        int[] arr = {1,2,3};
        f(arr, 0);
    }

    //确认某一个排列的第k位
    private static void f(int[] arr, int k) {
        if(k == 9) { //全部确认
//            if (check(arr)) {
//                ans++;
//            }
            print(arr);
        }

        for (int i = k; i < arr.length; i++) {
            //将第i位和第k位交换
            int t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;

            //选定第k位，移交下一层去确定k+1位
            f(arr, k+1);

            //回溯
            t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;

        }
    }

    private static boolean check(int[] arr) {

        return true;
    }

    private static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
