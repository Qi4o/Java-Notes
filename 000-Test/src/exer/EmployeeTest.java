package exer;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author Qiao
 * @Create 2021-11-03 8:03
 */
public class EmployeeTest {

    public static void main(String[] args) {
        test2();
    }
    //使用自然排序
    public static void test1(){
        TreeSet set = new TreeSet();
        Employee e1 = new Employee("liudehua", 55, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("zhangxueyou", 43, new MyDate(1987, 5, 4));
        Employee e3 = new Employee("guofucheng", 44, new MyDate(1987, 5, 9));
        Employee e4 = new Employee("liming", 51, new MyDate(1954, 8, 12));
        Employee e5 = new Employee("liudehua", 21, new MyDate(1978, 12, 4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        for(Object obj : set){
            System.out.println(obj);
        }
    }

    //按生日排序
    public static void test2(){
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;

                    MyDate b1 = e1.getBirthday();
                    MyDate b2 = e2.getBirthday();
                    //比较年
                    int minYear = b1.getYear() - b2.getYear();
                    if(minYear != 0){
                        return minYear;
                    }
                    //比较月
                    int minMonth = b1.getMonth() - b2.getMonth();
                    if(minMonth != 0){
                        return minMonth;
                    }
                    //比较日
                    return b1.getDay() - b2.getDay();
                }
                return 0;
            }
        });

        Employee e1 = new Employee("liudehua", 55, new MyDate(1965, 5, 4));
        Employee e2 = new Employee("zhangxueyou", 43, new MyDate(1987, 5, 4));
        Employee e3 = new Employee("guofucheng", 44, new MyDate(1987, 5, 9));
        Employee e4 = new Employee("liming", 51, new MyDate(1954, 8, 12));
        Employee e5 = new Employee("liudehua", 21, new MyDate(1978, 12, 4));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        for(Object obj : set){
            System.out.println(obj);
        }
    }
}
