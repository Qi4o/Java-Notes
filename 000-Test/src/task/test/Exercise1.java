package task.test;

/**
 * @Author Qiao
 * @Create 2022/5/6 16:32
 */

public class Exercise1 {
    int x,y;

    public Exercise1() {
    }

    public Exercise1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Exercise1 getLocation() {
        Exercise1 p = new Exercise1(x,y);
        return p;
    }

    @Override
    public String toString() {
        return "Exercise1{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args){
        Exercise1 p = new Exercise1();
        System.out.println(" x=" +p.x+" y=" +p.y);
        System.out.println(" Location is" +p.getLocation());
    }
}
