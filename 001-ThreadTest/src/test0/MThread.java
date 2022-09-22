package test0;

/**
 * @Author Qiao
 * @Create 2021-10-21 22:21
 */

/**
 * 创建多线程的方式二:实现Runnable接口
 * 1.创建一个实现了Runnable接口的类
 * 2.实现类去实现Runnable中的抽象方法run()
 * 3.创建实现类的对象
 * 4.将此对象作为参数传递到Thread类的构造器中,创建Thread类的对象
 * 5.通过Thread类的对象调用start()
 */

//1.创建了一个实现了Runnable接口的类
class M1Thread implements Runnable{
    //2.实现类去实现Runnable中的抽象方法run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

public class MThread {
    public static void main(String[] args) {
        //3.创建实现类的对象
        M1Thread m1 = new M1Thread();
        //4.将此对象作为参数传递到Thread类的构造器中,创建Thread类的对象
        Thread t1 = new Thread(m1);
        //5.通过Thread类的对象调用start()
        String stt ="B", sttt="A";
        stt.equals(sttt);
        System.out.println(sttt.compareTo(sttt));
    }
}

