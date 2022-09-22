package task.student;

/**
 * @Author Qiao
 * @Create 2022/4/15 16:28
 */

public class Division {
    private double dividend = 1;
    private double divisor = 1;

    public double getDividend() {
        return dividend;
    }

    public void setDividend(double dividend) {
        this.dividend = dividend;
    }

    public double getDivisor() {
        return divisor;
    }

    public void setDivisor(double divisor) {
        if (divisor == 0) {
            System.out.println("除数不能为0");
            return;
        }
        this.divisor = divisor;
    }

    public void result(){
        System.out.println(divisor/dividend);
    }
}
