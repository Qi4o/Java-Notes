package Java_2014.B;

/**
 * @Author Qiao
 * @Create 2022/3/31 13:27
 */

public class _04大衍数列 {
    public static void main(String[] args) {
        int i;
        for (i = 1; i < 100; i++) {
            if (i%2 == 0){
                System.out.println(i*i/2);
            }
            else {
                System.out.println((i*i-1)/2);
            }
        }
    }
}
