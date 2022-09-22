package task.interfacetask;

/**
 * @Author Qiao
 * @Create 2022/5/1 20:35
 */

public class Keyboard implements USB{
    @Override
    public void start() {
        System.out.println("键盘启动了");
    }
    @Override
    public void end() {
        System.out.println("键盘关闭了");
    }
}
