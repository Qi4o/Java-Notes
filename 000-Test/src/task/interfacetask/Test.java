package task.interfacetask;

/**
 * @Author Qiao
 * @Create 2022/5/1 20:39
 */

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.add(new Mouse());
        computer.add(new Keyboard());
        computer.add(new Microphone());

        computer.start();
        System.out.println();
        computer.end();
    }
}
