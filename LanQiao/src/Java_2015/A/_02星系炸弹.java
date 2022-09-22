package Java_2015.A;

import java.util.Calendar;

/**
 * @Author Qiao
 * @Create 2022/4/8 16:23
 */

public class _02星系炸弹 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2014,10,9);
        calendar.add(Calendar.DATE, 1000);

        System.out.println(calendar.getTime());
    }
}
