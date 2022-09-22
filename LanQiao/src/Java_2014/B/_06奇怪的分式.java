package Java_2014.B;

/**
 * @Author Qiao
 * @Create 2022/3/31 13:43
 */

public class _06奇怪的分式 {
    public static void main(String[] args) {
        int ans = 0;
        for(int a = 1; a < 10; a++) {
            for(int b = 1; b < 10; b++){
                if (a != b){
                    for (int c = 1; c < 10; c++){
                        for (int d = 1; d < 10; d++) {
                            if (c != d) {
                                if ((float)a/b*(float)c/d  == (float)(a*10+c)/(b*10+d)){
                                    ans++;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
