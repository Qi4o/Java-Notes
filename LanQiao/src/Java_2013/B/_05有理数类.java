package Java_2013.B;

/**
 * @Author Qiao
 * @Create 2022/3/29 15:06
 */

public class _05有理数类 {
    public static void main(String[] args) {
        Rational a = new Rational(1,3);
        Rational b = new Rational(1, 6);
        Rational c = a.add(b);
        System.out.println(a+"+"+b+"="+c);
    }
    static class Rational{
        private long ra;
        private long rb;

        private long gcd(long a, long b) {
            if (b==0) return a;
            return gcd(b,a%b);
        }

        public Rational(long a, long b) {
            ra = a;
            rb = b;
            long k = gcd(ra, rb);
            if (k > 1) {
                ra /= k;
                rb /= k;
            }
        }

        //加法
        public Rational add(Rational x) {
            //填空题
            return new Rational(this.ra*x.rb+x.ra*this.rb, this.rb*x.rb);
        }

        //减法
        public Rational mul(Rational x) {
            return new Rational(ra*x.ra, rb*x.rb);
        }

        public String toString() {
            if (rb == 1) return "" + ra;
            return ra + "/" + rb;
        }
    }
}
