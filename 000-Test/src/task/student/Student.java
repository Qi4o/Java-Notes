package task.student;

/**
 * @Author Qiao
 * @Create 2022/4/15 16:18
 */

public class Student {
    static String className = "三年级二班";

    private String name;
    private int age;

    public Student(){};

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        if (age < 0) {
            System.out.println("年龄不能小雨0");
            return;
        } else {
            this.age = age;
        }
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("年龄不能小雨0");
            return;
        }
        this.age = age;
    }
}
