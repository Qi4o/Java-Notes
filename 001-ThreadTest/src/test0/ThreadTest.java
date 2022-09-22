package test0;

/**
 * @Author Qiao
 * @Create 2021-10-21 18:33
 */

//多线程的创建，方式一：继承于Thread类
    //1.创建一个继承于Thread类的子类
    //2.重写Thread类的run() --> 将此线程要执行的操作写在run方法中
    //3.创建Thread类的子类对象
    //4.通过此类调用start()：①启动当前线程 ②调用当前线程的run()
public class ThreadTest {
    public static void main(String[] args) {
        //3.创建子类的对象
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
        System.out.println("hello");
        for (int i = 0; i < 100; i++) {
            System.out.println("*******");
        }
    }
}

//1.创建一个继承与Thread类的子类
class MyThread extends Thread{
    @Override
    //2.重写Thread类的run()
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(i + getName());
            }
        }
    }

    public void method1() {
        if(1 > 0){
            throw new RuntimeException();
        }
    }
}

