package Java_2014.A;

/**
 * @Author Qiao
 * @Create 2022/3/30 15:29
 */

public class _04写日志 {
    static class A{
        private static int n = 1;
        public static void write(String msg){
            String filename = "t" +  n + ".long";
//            n = (n+1==3)?3:(n+1)%3;   //填空
//            n = ((n++)%3==0)?1:n;
            n = n % 3 + 1;
            System.out.println("write to file: " + filename + " " + msg);
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            A.write("aaa");
        }
    }
}
