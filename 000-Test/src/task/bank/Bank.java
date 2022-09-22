package task.bank;

import java.util.Scanner;

/**
 * @Author Qiao
 * @Create 2022/4/8 19:02
 */

public class Bank {
    static String BankName = "工商银行";

    private User user;

    static {
        System.out.println("欢迎来到"+BankName);
    }

    public Bank(String name, String password, int balance){
        user = new User(name, password, balance);
        System.out.println(user.name+" 开户成功，账户余额："+user.balance);
    }

    public void SaveMoney() {
        System.out.println("请输入你要存入的金额");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        user.balance += n;
        System.out.println(user.name+"你好！ 存入成功！ 当前账户余额："+user.balance);
    }

    public void Withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的密码：");
        String password = sc.next();
        if (!password.equals(user.password)) {
            System.out.println("密码错误！");
            return;
        }

        System.out.println(user.name+" 请输入你要取出的金额");

        double n = sc.nextDouble();
        if (user.balance - n >= 0) {
            user.balance -= n;
            System.out.println("取款成功！ 当前账户余额："+user.balance);
        } else {
            System.out.println("余额不足");
        }
    }

    static void close(){
        System.out.println("请携带好随身财物");
    }
}
