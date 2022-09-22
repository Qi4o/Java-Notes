package task.market;

/**
 * @Author Qiao
 * @Create 2022/4/1 15:34
 */

public class Market {
    private String name;
    private Product product;

    public Market(String name) {
        this.name = name;
    }

    public void sell(String productName) {
        if (!product.check(productName)) {
            System.out.println(name + "里没有" + productName);
            return;
        }

        if (product.productArr.get(productName) >= 1){
            product.productArr.put(productName, product.productArr.get(productName) - 1);
            System.out.println(productName + "购买成功! " + productName + "剩余数量：" + product.productArr.get(productName));

        } else {
            System.out.println(productName + "购买失败! 超市没有货了");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
