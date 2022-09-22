package Java_2013.A;

import java.util.Calendar;

/**
 * @Author Qiao
 * @Create 2022/3/17 22:03
 */


//1999.12.31后 那个xx99.12.31正好是星期天
public class _01世纪末的星期 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        for (int i = 1999; i < 10000; i+=100) {
            calendar.set(Calendar.YEAR, i);
            calendar.set(Calendar.MONTH, 11);
            calendar.set(Calendar.DAY_OF_MONTH, 31);

            if (calendar.get(Calendar.DAY_OF_WEEK) == 1){
                System.out.println(i);
                break;
            }
        }
    }
}
