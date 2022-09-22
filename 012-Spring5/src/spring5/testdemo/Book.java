package spring5.testdemo;

/**
 * @Author Qiao
 * @Create 2022/4/13 15:18
 */

public class Book {
    private String bname;
    private String bauthor;

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void test(){
        System.out.println(bname+"::"+bauthor);
    }
}
