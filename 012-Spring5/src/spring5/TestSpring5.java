package spring5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.autowire.Emp;
import spring5.testdemo.Book;
import spring5.testdemo.Orders;
import spring5.testdemo.User;

/**
 * @Author Qiao
 * @Create 2022/4/13 11:00
 */

public class TestSpring5 {

    @Test
    public void testAdd(){
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();


        User user1 = context.getBean("user", User.class);
        System.out.println(user1);
        user1.add();

        System.out.println(user.equals(user1));
    }

    @Test
    public void testBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.test();
    }

    @Test
    public void testBean3() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);

        //手动让bean实例销毁
        context.close();
    }

    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");

        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);
    }

}
