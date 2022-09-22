package exer0;

/**
 * @Author Qiao
 * @Create 2021-10-21 22:06
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Window w1 = new Window();
        w1.start();
    }
}

//存在线程安全问题
class Window extends Thread{

    private static int ticket = 100;

    @Override
    public void run() {
        while(ticket >= 0){
            System.out.println(getName() + ": " + ticket--);
        }
    }
}