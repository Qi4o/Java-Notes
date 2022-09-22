package task.test;

/**
 * @Author Qiao
 * @Create 2022/5/6 16:25
 */

public class P87 {
    float a;
    static float b;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public static float getB() {
        return b;
    }

    public static void setB(float b) {
        P87.b = b;
    }

    void inputA(){
        System.out.println(a);
    }

    void inputB(){
        System.out.println(b);
    }
}
