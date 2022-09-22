package task.extend;

/**
 * @Author Qiao
 * @Create 2022/4/15 16:43
 */

public class NewPhone extends Phone{
    @Override
    public void call(){
        System.out.println("打电话");
        System.out.println("开启语音");
    }
}
