package exer0;

/**
 * @Author Qiao
 * @Create 2021-10-21 22:52
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        M1PThread m1 = new M1PThread();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m1);
        t1.start();
        t2.start();
    }
}

class M1PThread implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while (ticket > 0){
            System.out.println(Thread.currentThread().getName() + ": " + ticket--);
        }
    }
}