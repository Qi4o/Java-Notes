package task.test;

/**
 * @Author Qiao
 * @Create 2022/5/6 17:04
 */

abstract class Person {
    private String name;
    public Person(String n){
        name = n;
    }
    public abstract String getDescription();
    public String getName(){
        return name;
    }
}

class Student extends Person{
    private String major;
    public Student (String n, String m){
        super(n);
        major = m;
    }

    @Override
    public String getDescription() {
        return "学生专业是：" + major;
    }
}
