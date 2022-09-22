package Java_2017.B;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author Qiao
 * @Create 2022/4/4 14:42
 */

public class _05日期问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();

        int a = Integer.parseInt(date.charAt(0) + "" + date.charAt(1));
        int b = Integer.parseInt(date.charAt(3) + "" + date.charAt(4));
        int c = Integer.parseInt(date.charAt(6) + "" + date.charAt(7));

        String as = f(a,b,c);
        String bs = f(c,a,b);
        String cs = f(c,b,a);

        Set<String> set = new HashSet<>();
        set.add(as);
        set.add(bs);
        set.add(cs);

        for (String t : set) {
            if (!t.equals("")) System.out.println(t);
        }
    }

    static String f(int a,int b,int c) {
        if (a < 60) {
            a+=2000;
        } else if(a > 59){
            a+=1900;
        } else {
            return "";
        }

        if (b > 12) return "";
        if (c > 31) return "";

        switch(b) {
            case 2:
                if (isLeap(a)) {
                    if (c > 29) return "";
                } else {
                    if (c > 28) return "";
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (c > 30) return "";
            default:
                break;
        }
        String sa = a+"";
        String sb = b+"";
        String sc = c+"";
        if (b < 10) {
            sb = "0"+sb;
        }
        if (c < 10) {
            sc = "0"+sc;
        }

        return ""+sa+"-"+sb+"-"+sc;
    }

    static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
