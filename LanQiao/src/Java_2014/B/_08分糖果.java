package Java_2014.B;

import java.util.Scanner;

/**
 * @Author Qiao
 * @Create 2022/4/1 08:38
 */

public class _08分糖果 {
    static int n;
    static int[] arr;
    static int[] temp;
    static int ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        temp = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        label:while (true) {
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    temp[n-1] = arr[i]/2;
                    arr[i] = arr[i]/2;
                } else {
                    temp[i-1] = arr[i]/2;
                    arr[i] = arr[i/2];
                }
            }

            for (int i = 0; i < n; i++) {
                arr[i] += temp[i];
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
                    arr[i]+=1;
                    ans++;
                }
            }

            int t = arr[0];
            for (int i = 0; i < n; i++) {
                if (arr[i] != t) {
                    break;
                }
                if (i == n-1) {
                    break label;
                }
            }
        }

        System.out.println(ans);
    }
}
