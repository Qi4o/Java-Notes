package Java_2016.B;

/**
 * @Author Qiao
 * @Create 2022/4/7 08:36
 */

public class _03凑算式 {
    static int[] arr = {1,2,3,4,5,6,7,8,9};
    static int ans;

    public static void main(String[] args) {
        f(0);
        System.out.println(ans);
    }

    static void f(int k) {
        if (k == 9) {
            if (check()) {
                ans++;
            }
        }

        for (int i = k; i < 9; i++) {
            int t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;

            f(k+1);

            t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;
        }
    }

    static boolean check() {
        int x = arr[3] * 100 + arr[4] * 10 + arr[5];
        int y = arr[6] * 100 + arr[7] * 10 + arr[8];
        if ((arr[1] * y + arr[2] * x) % (y * arr[2]) == 0 && arr[0] + (arr[1] * y + arr[2] * x) / (y * arr[2]) == 10) {
            return true;
        }
        return false;
    }
}
