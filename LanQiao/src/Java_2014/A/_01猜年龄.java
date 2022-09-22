package Java_2014.A;

/**
 * @Author Qiao
 * @Create 2022/3/30 14:22
 */


    //年龄之积是年龄之和的6倍
    //年龄差不超过8岁
    //求较小的年龄
public class _01猜年龄 {
    public static void main(String[] args) {
        label:for (int i = 1; i < 100; i++) {
            for (int j = i; j < i+8; j++) {
                if ((i+j)*6 == i*j){
                    System.out.println(i + " " + j);
                    break label;
                }
            }
        }
    }
}
