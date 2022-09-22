package task.interfacetask;

/**
 * @Author Qiao
 * @Create 2022/5/1 20:36
 */

public class Microphone implements USB{
    @Override
    public void start() {
        System.out.println("麦克风启动了");
    }
    @Override
    public void end() {
        System.out.println("麦克风关闭了");
    }
}
