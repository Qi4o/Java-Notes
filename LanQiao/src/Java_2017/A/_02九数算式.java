package Java_2017.A;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Qiao
 * @Create 2022/4/2 16:48
 */

public class _02九数算式 {
    static int[] arr = {1,2,3,4,5,6,7,8,9};
    static int ans;
    public static void main(String[] args) {
        f(0);
        System.out.println(ans/2);
    }
    
    static void f(int k) {
        if (k == 9) {
            for (int i = 1; i <= 8; i++) {
                int x1 = a2b(0, i);
                int x2 = a2b(i, 9);
                if (check(x1,x2)) {
                    ans++;
                }
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

    private static boolean check(int x1, int x2) {
        Set<Character> set = new HashSet<>();
        String s = x1*x2+"";
        if (s.length() != 9) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        return set.size() == 9 && !set.contains('0');

    }

    static int a2b(int i, int j) {
        int ans = 0;
        int p = 1;
        for (int k = j-1; k >= i; k--) {
            ans += arr[k]*p;
            p*=10;
        }
        return ans;
    }
}
