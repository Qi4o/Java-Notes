package task.market;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Qiao
 * @Create 2022/4/1 15:34
 */

public class Product {
    public Map<String, Integer> productArr = new HashMap<>();

    public Product(int a, int b, int c, int d, int e) { //初始化库存
        productArr.put("电视机", a);
        productArr.put("洗衣机", b);
        productArr.put("豆浆机", c);
        productArr.put("空调", d);
        productArr.put("吹风机", e);
    }

    public boolean check(String productName) {
        return productArr.containsKey(productName);
    }
}
