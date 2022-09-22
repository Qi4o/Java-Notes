package test0;

/**
 * @Author Qiao
 * @Create 2022/8/2 14:21
 */

public class Result {

    public TestInterface testInterface;

    public void test(){
        testInterface.add();
    }

    public static void main(String[] args) {
        Result result = new Result();
        result.test();
    }
}
