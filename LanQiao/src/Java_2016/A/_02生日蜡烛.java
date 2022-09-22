package Java_2016.A;

/**
 * @Author Qiao
 * @Create 2022/4/6 14:16
 */

public class _02生日蜡烛 {
    public static void main(String[] args) {
        int sum = 0;
        label:for (int i = 1; i < 100; i++) {
            for (int j = i; j < 100; j++) {
                sum+=j;
                if (sum == 236){
                    System.out.println(i);
                    break label;
                }
            }
            sum = 0;
        }
    }
}
