package dynamic;

/**
 * @Author Qiao
 * @Create 2022/3/18 17:18
 */

public class KnapsackProblem {
    public static void main(String[] args) {
        int[] w = {1, 4, 3};    //物品的重量
        int[] val = {1500, 3000, 2000}; //物品的价值
        int m = 4;  //背包的容量
        int n = val.length; //物品的个数

        //创建二维数组
        //v[i][j] 表示在前i个物品中能够装入容量为j的背包中的最大价值
        int[][] v = new int[n+1][m+1];

        //初始化第一行第一列，可有可无
        for (int i = 0; i < v.length; i++) {
            v[i][0] = 0;    //第一列设置为0
        }
        for (int i = 0; i < v[0].length; i++) {
            v[0][i] = 0;    //第一行设置为0
        }

        //动态规划
        for (int i = 1; i < v.length; i++) {    //不处理第一行
            for (int j = 1; j < v[0].length; j++) { //不处理第一列
                if (w[i-1] > j) {
                    v[i][j] = v[i-1][j];
                } else {
                    v[i][j] = Math.max(v[i-1][j], val[i-1] + v[i-1][j-w[i-1]]);
                }
            }
        }

        //打印
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
    }
}
