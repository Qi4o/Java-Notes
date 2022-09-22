package Java_2013.C;

/**
 * @Author Qiao
 * @Create 2022/3/23 13:37
 */

public class _06逆波兰表达式 {


    static int[] evaluate(String x) {
        if (x.length() == 0) return new int[]{0,0};

        char c = x.charAt(0); //获取第一个字符
        if (c>='0' && c<='9') //这是个数字
            return new int[] {c-'0', 1};

        int[] v1 = evaluate(x.substring(1)); //第一个字符是运算符，截取后面的部分
        int[] v2 = evaluate(x.substring(1+v1[1]));    //填空

        int v = Integer.MAX_VALUE;
        if (c=='+') v = v1[0] + v2[0];
        if (c=='-') v = v1[0] - v2[0];
        if (c=='*') v = v1[0] * v2[0];

        return new int[] {v,1+v1[1] + v2[1]};
    }
}
