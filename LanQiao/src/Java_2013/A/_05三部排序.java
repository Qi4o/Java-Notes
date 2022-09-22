package Java_2013.A;

import java.util.Arrays;

/**
 * @Author Qiao
 * @Create 2022/3/22 16:26
 */

//负数在左端，正数在右端，0在中间 不要求有序，一次线性扫描结束
public class _05三部排序 {

    public static void main(String[] args) {
        int[] x = {-3, -44,-5,0,-5,-4,2};
        sort(x);
        System.out.println(Arrays.toString(x));
    }

    static void sort(int[] x) {
        int p = 0;
        int left = 0;
        int right = x.length-1;

        while (p <= right) {
            if (x[p] < 0) {
                int t = x[left];
                x[left] = x[p];
                x[p] = t;
                left++;
                p++;
            } else if (x[p] > 0) {
                int t = x[right];
                x[right] = x[p];
                x[p] = t;
                right--;
            } else {
                //代码填空;
                p++;
            }
        }

    }
}
