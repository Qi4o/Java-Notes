package Java_2014.A;

/**
 * @Author Qiao
 * @Create 2022/3/30 14:30
 */

    //出门2斗酒
    //逢店加一倍， 遇花喝一斗
    //遇到店5次， 遇到花10次。 最后一次遇到的是花，正好把酒喝完
    //求可能遇到的次序有多少种

public class _02李白打酒 {
    static int ans = 0;
    public static void main(String[] args) {
        f(2, 5, 9);
        System.out.println(ans);
    }

    static void f(int n, int shop, int flower) {
        if (n == 1 && shop == 0 && flower == 0){
            ans++;
            return;
        }
        if(shop > 0)f(n * 2, shop - 1, flower);
        if(flower > 0)f(n - 1, shop, flower - 1);
    }
}
