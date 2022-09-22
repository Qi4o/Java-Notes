package task.task9;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author Qiao
 * @Create 2022/5/13 16:14
 */

public class Example01 {
    public static void main(String[] args) {
        Collection con1 = new ArrayList();
        Collection con2 = new ArrayList();
        con1.add("a");
        con1.add("b");
        System.out.println("con1是否为空 " + con1.isEmpty());
        System.out.println("con2是否为空 " + con2.isEmpty());
        System.out.println("两个是否有相同元素" + con1.contains(con2));
        System.out.println("con1长度 " + con1.size());
    }
}
