package task.task9;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Qiao
 * @Create 2022/5/13 16:17
 */

public class Example02 {
    public static void main(String[] args) {
        List list1 = new ArrayList<>();
        List list2 = new ArrayList<>();

        list1.add("a");
        list1.add("b");
        list1.add("c");

        System.out.println(list1);
        System.out.println("subList(0,2) " + list1.subList(0,2));
        list1.set(0,"q");
        System.out.println("修改第一个元素的值" + list1);
    }
}
