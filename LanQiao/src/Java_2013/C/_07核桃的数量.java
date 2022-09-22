package Java_2013.C;

import java.util.Scanner;

/**
 * @Author Qiao
 * @Create 2022/3/30 10:36
 */

    //3个组
    //1.各组核桃数量相同
    //2.各组内能平分核桃
    //3.尽量满足1,2条件的最小数量

    //输入a,b,c表示三组人数
    //输入一个整数表示核桃数量
public class _07核桃的数量 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        for (int i = 3; i <= a*b*c; i+=3) {
            if (i%a==0 && i%b==0 && i%c==0) {
                System.out.println(i);
                break;
            }
        }


    }

}
