package spring5.testdemo;

/**
 * @Author Qiao
 * @Create 2022/4/18 09:41
 */

public class Orders {
    public Orders(){
        System.out.println("第一步 执行无参构造bean实例");
    }

    private String oname;

    public void setOname(String oname){
        this.oname = oname;
        System.out.println("第二步 调用set方法设置属性的值");
    }

    //初始化的方法
    public void initMethod(){
        System.out.println("第三步 初始化的方法");
    }

    //销毁的方法
    public void destroyMethod() {
        System.out.println("第五步 销毁");
    }
}
