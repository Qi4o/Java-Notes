package Java_2016.B;

/**
 * @Author Qiao
 * @Create 2022/4/7 09:25
 */

public class _06方格填数 {
    static int[] arr = {0,1,2,3,4,5,6,7,8,9};
    static int ans;

    public static void main(String[] args) {
        f(0);
        System.out.println(ans);
    }

    static void f(int k) {
        if (k == 10) {
            if (check()) {
                ans++;
            }
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

    static boolean check() {
        if (diff(arr[0],arr[1]) && diff(arr[0],arr[3]) && diff(arr[0],arr[4]) && diff(arr[0],arr[5])) {
            if (diff(arr[1],arr[2]) && diff(arr[1],arr[4]) && diff(arr[1],arr[5]) && diff(arr[1],arr[6])) {
                if (diff(arr[2],arr[5]) && diff(arr[2], arr[6])) {
                    if (diff(arr[3],arr[4]) && diff(arr[3], arr[7]) && diff(arr[3], arr[8])) {
                        if (diff(arr[4],arr[5]) && diff(arr[4],arr[7]) && diff(arr[4],arr[8]) && diff(arr[4],arr[9])){
                            if (diff(arr[5],arr[6]) && diff(arr[5],arr[8]) && diff(arr[5],arr[9])){
                                if (diff(arr[6],arr[9])){
                                    if (diff(arr[7],arr[8])) {
                                        if (diff(arr[8], arr[9])) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    static boolean diff(int x, int y) {
        if (x+1 != y && x-1 != y) {
            return true;
        }
        return false;
    }
}
