package task.test;

/**
 * @Author Qiao
 * @Create 2022/5/6 16:28
 */

public class Student1 {
    private String studentNumber;
    private String classNumber;
    private String name;
    private boolean sex;
    private int age;

    public Student1(String studentNumber, String classNumber, String name, boolean sex, int age) {
        this.studentNumber = studentNumber;
        this.classNumber = classNumber;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", classNumber='" + classNumber + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
