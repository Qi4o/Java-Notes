package Java_2013.C;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Qiao
 * @Create 2022/3/29 22:51
 */

//1949可以组成多少个素数
    //素数判定 素数生成 质因数分解
    //全排列+检查
public class _02组素数 {
    static Set<Integer> set = new HashSet<>();

    static void f(int[] arr, int k){
        if (k == 4) //前面都已经确定
            check(arr);
        for (int i = k; i < 4; i++) {
            //交换
            int t = arr[k];
            arr[k] = arr[i];
            arr[i] = t;

            f(arr, k+1);

            t = arr[k];
            arr[k] = arr[i];
            arr[i] = t;
        }
    }

    private static void check(int[] arr) {
        int x = arr[0]*1000 + arr[1]*100 + arr[2]*10 + arr[3];
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) set.add(x);
    }

    public static void main(String[] args) {
        int[] arr = {1,4,9,9};
        f(arr, 0);
        System.out.println(set.size());
    }
}
