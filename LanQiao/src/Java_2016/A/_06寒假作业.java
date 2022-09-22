package Java_2016.A;

/**
 * @Author Qiao
 * @Create 2022/4/6 14:48
 */

public class _06寒假作业 {
    static int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    static int ans;

    public static void main(String[] args) {
        f(0);
        System.out.println(ans);
    }

    static void f(int k) {
        if (k == 12) {
            if (arr[0] + arr[1] == arr[2]) {
                if (arr[3] - arr[4] == arr[5]) {
                    if (arr[6] * arr[7] == arr[8]) {
                        if (arr[9] / arr[10] == arr[11] && arr[9]%arr[10] == 0) {
                            ans++;
                        }
                    }
                }
            }
            return;
        }

        for (int i = k; i < 13; i++) {
            int t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;

            f(k+1);

            t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;
        }
    }
}
