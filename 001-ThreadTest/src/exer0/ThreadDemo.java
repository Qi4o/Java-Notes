package exer0;

/**
 * @Author Qiao
 * @Create 2021-10-21 19:43
 */

//Thread匿名子类
public class ThreadDemo {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i+=2) {
                    System.out.println(Thread.currentThread().getName() + "--" + i);
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i < 100; i+=2) {
                    System.out.println(Thread.currentThread().getName() + "--" + i);
                }
            }
        }.start();
    }
}
