package task.bank;

/**
 * @Author Qiao
 * @Create 2022/4/8 19:05
 */

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank("小明", "123456", 1000);
        bank.SaveMoney();
        bank.Withdraw();
        Bank.close();
    }
}
