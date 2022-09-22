package Java_2013.A;

/**
 * @Author Qiao
 * @Create 2022/3/17 22:51
 */

//横行或纵向行走 正好走出"从我做起振兴中华" 有几种走法

/*
    从我做起振
    我做起振兴
    做起振兴中
    起振兴中华
 */
public class _02振兴中华 {
    public static void main(String[] args){
        //重复
        //变化
        //边界
        int ans = f(0,0);
        System.out.println(ans);
    }

    private static int f(int i, int j) {
        if (i == 3 || j == 4){
            return 1;
        }
        return f(i+1, j) + f(i, j+1);
    }
}
