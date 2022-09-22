package Java_2014.A;

/**
 * @Author Qiao
 * @Create 2022/3/30 16:33
 */


    //六角形中 填入1～12的数字
    //使得每条直线上的数字之和都相等

public class _06六角填数 {
    static int[] arr = {2,4,5,6,7,9,10,11,12};
    public static void main(String[] args) {
        f(0);
        System.out.println(arr[6]);
    }

    static void f(int k){
        if (k == 9) {
            check();
            return;
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
        int r1 = 8 + arr[0] + arr[1] + arr[2];
        int r2 = arr[2] + arr[3] + arr[4] + 3;
        int r3 = 3 + arr[5] + arr[6] + 8;
        int r4 = 1 + arr[1] + arr[3] + arr[8];
        int r5 = arr[8] + arr[4] + arr[5] + arr[7];
        int r6 = arr[7] + arr[6] + arr[0] + 1;

        if (r1==r2 && r2==r3 && r3==r4 && r4==r5 && r5==r6) {
            return true;
        }
        return false;
    }
}
