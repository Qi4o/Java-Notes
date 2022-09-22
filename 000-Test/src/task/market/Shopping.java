package task.market;

import java.util.Scanner;

/**
 * @Author Qiao
 * @Create 2022/4/1 15:33
 */

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Market market;
        Person person;
        Product product = new Product(1,2,3,4,5);


        System.out.println("请输入你的名字");
        person = new Person(sc.next());
        System.out.println("请输入想去的超市");
        market = new Market(sc.next());

        person.setMarket(market);
        market.setProduct(product);


        String productName;
        String flag;
        while (true) {
            System.out.println("是否继续购买商品: yes/no");
            flag = sc.next();
            if (flag.equals("no")) {
                System.out.println("离开超市");
                break;
            }
            System.out.println("请输入要购买的物品");
            productName = sc.next();
            person.sell(productName);
        }

    }
}
