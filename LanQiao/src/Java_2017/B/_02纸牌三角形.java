package Java_2017.B;

/**
 * @Author Qiao
 * @Create 2022/4/4 10:04
 */

public class _02纸牌三角形 {
    static int[] arr = {1,2,3,4,5,6,7,8,9};
    static int ans;
    public static void main(String[] args) {
        f(0);
        System.out.println(ans/3/2);
    }

    static void f(int k) {
        if (k == 9){
            if (check()){
                ans++;
            }
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

    static boolean check(){
        return arr[0]+arr[1]+arr[2]+arr[3] == arr[3]+arr[4]+arr[5]+arr[6] && arr[3]+arr[4]+arr[5]+arr[6] == arr[6] + arr[7] + arr[8] +arr[0];
    }
}
