package Java_2013.C;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author Qiao
 * @Create 2022/3/30 11:34
 */


    //4颗一包活或7颗一包
    //包装组合，最大不能买到的数量
    //4和7最大不能买到的数量是17，大于17的任何数字都可以用4和7组合出来


    //解法1：数学问题 a*b-a-b
    //解法2：从大到小枚举

public class _09买不到的糖果 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = a*b;
        Set<Integer> ss = new HashSet<>();

        for (int x = 0; a*x < max; x++) {
            for (int y = 0; a*x + b*y < max; y++) {
                ss.add(a*x + b*y);
            }
        }

        for (int i = max-1; i >= 0; i--) {
            if (!ss.contains(i)) {  //查找第一个不在set里的值
                System.out.println(i);
                break;
            }
        }
    }
}
