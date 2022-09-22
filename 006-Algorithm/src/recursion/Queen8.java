package recursion;

/**
 * @Author Qiao
 * @Create 2022/3/14 08:50
 */

public class Queen8 {

    int max = 8;    //定义一个max表示有多少个皇后
    //定义数组array，保存皇后放置位置的结果，比如arr = {0, 4, 7, 5, 2, 6, 1, 3}
    int[] array = new int[max];
    static int count = 0;

    public static void main(String[] args) {
        //测试
        Queen8 queen8 = new Queen8();
        queen8.check(0);
        System.out.println(count);
    }

    //放置皇后
    private void check(int n){
        if (n == max) { //n=8, 八个皇后已经放好了
            print();
            return;
        }

        //依次放入皇后，并判断是否冲突
        for (int i = 0; i < max; i++) {
            //先把当前皇后n，放到该行的第1列
            array[n] = i;
            //判断当放置第n个皇后到i列时，是否冲突
            if (judge(n)) {
                //接着放n+1个皇后，开始递归
                check(n+1);
            }
            //如果冲突，就继续执行array[n] = i, 即将第n个皇后放置在本行的后移的一个位置
        }
    }

    //查看当我们放置第N个皇后，检测该皇后的位置是否冲突
    private boolean judge(int n){   //n表示第n个皇后
        for (int i = 0; i < n; i++) {
            //1.array[i] == array[n] 判断是否在一列
            //2.Math.abs(n-i) == Math.abs(array[n] - array[i]) 判断是否在一斜线
            if (array[i] == array[n] || Math.abs(n-i) == Math.abs(array[n] - array[i])){
                return false;
            }
        }
        return true;
    }


    //将皇后摆放的位置输出
    private void print(){
        count++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
