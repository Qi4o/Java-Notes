package Java_2014.B;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Qiao
 * @Create 2022/4/1 07:48
 */

public class _07扑克排序 {
    static char[] arr = {'A', 'A', '2', '2', '3', '3', '4', '4'};
    static Set<String> set = new HashSet<>();
    public static void main(String[] args) {
        f(0);
        System.out.println(set);
    }

    static void f(int k) {
        if (k == arr.length) {
            if (check()) {
                set.add(new String(arr));
            }
        }

        for (int i = k; i < arr.length; i++) {
            char t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;

            f(k+1);

            t = arr[i];
            arr[i] = arr[k];
            arr[k] = t;
        }
    }

    static boolean check() {
        String t = new String(arr);
        if (t.lastIndexOf("Java_2017/A") - t.indexOf("Java_2017/A") == 2 &&
                t.lastIndexOf("2") - t.indexOf("2") == 3 &&
                t.lastIndexOf("3") - t.indexOf("3") == 4 &&
                t.lastIndexOf("4") - t.indexOf("4") == 5) {
            return true;
        }
        return false;
    }
}
