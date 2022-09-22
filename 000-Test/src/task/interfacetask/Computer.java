package task.interfacetask;

/**
 * @Author Qiao
 * @Create 2022/5/1 20:36
 */

public class Computer {
    private USB[] usbArr = new USB[3];

    public void add(USB usb) {
        for (int i = 0; i < usbArr.length; i++) {
            if (usbArr[i] == null) {
                usbArr[i] = usb;
                break;
            }
        }
    }

    public void start(){
        for (int i = 0; i < usbArr.length; i++) {
            usbArr[i].start();
        }
        System.out.println("电脑开机成功");
    }

    public void end(){
        for (int i = 0; i < usbArr.length; i++) {
            usbArr[i].end();
        }
        System.out.println("电脑关机成功");
    }
}
