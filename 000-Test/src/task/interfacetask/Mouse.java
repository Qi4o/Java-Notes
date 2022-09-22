package task.interfacetask;

/**
 * @Author Qiao
 * @Create 2022/5/1 20:34
 */

public class Mouse implements USB{
    @Override
    public void start() {
        System.out.println("鼠标启动了");
    }
    @Override
    public void end() {
        System.out.println("鼠标关闭了");
    }
}
