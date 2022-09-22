package task.phone;

/**
 * @Author Qiao
 * @Create 2022/4/15 16:21
 */

public class Phone {
    String brand;
    double price;

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void call() {
        System.out.println("打电话");
    }
}
