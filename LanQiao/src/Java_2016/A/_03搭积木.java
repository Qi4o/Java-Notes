package Java_2016.A;

/**
 * @Author Qiao
 * @Create 2022/4/6 14:16
 */

public class _03搭积木 {
    static int ans;
    static int[] arr = {0,1,2,3,4,5,6,7,8,9};

    public static void main(String[] args) {
        f(0);
        System.out.println(ans);
    }

    static void f(int k) {
        if (k==9) {
            if (arr[0] < arr[1] && arr[0] < arr[2]) {
                if (arr[1] < arr[3] && arr[1] < arr[4]) {
                    if (arr[2] < arr[4] && arr[2] < arr[5]) {
                        if (arr[3] < arr[6] && arr[3] < arr[7]) {
                            if (arr[4] < arr[7] && arr[4] < arr[8]) {
                                if (arr[5] < arr[8] && arr[5] < arr[9]) {
                                    ans++;
                                }
                            }
                        }
                    }
                }
            }
            return;
        }

        for (int i = k; i < 10; i++) {
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
