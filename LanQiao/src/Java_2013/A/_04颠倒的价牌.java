package Java_2013.A;



import java.util.HashMap;
import java.util.Map;

/**
 * @Author Qiao
 * @Create 2022/3/20 09:34
 */
//3 4 7
//能颠倒的数字：1 2 5 6 8 9 0
//颠倒后一个赔了两百多，一个赚了八百多，综合赚了558
//求赔钱价牌的正确数字
public class _04颠倒的价牌 {
    public static void main(String[] args) {
        Map<Integer, Integer> m1 = new HashMap();
        Map<Integer, Integer> m2 = new HashMap();
        String temp;
        for (int i = 1000; i < 10000; i++) {
            temp = "" + i;
            if (!(temp.contains("3") || temp.contains("4") || temp.contains("7"))){
                int result =  test(temp);
                if (result - i > -300 && result - i < -200){
                    m1.put(i,result - i);
                }
                if (result - i > 800 && result - i < 900){
                    m2.put(i,result-i);
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry2 : m2.entrySet()){
            System.out.println(entry2.getKey() + " " + entry2.getValue());
        }
        System.out.println();
        for (Map.Entry<Integer, Integer> entry1 : m1.entrySet()){
            System.out.println(entry1.getKey() + " " + entry1.getValue());
        }

        System.out.println();

        for (Map.Entry<Integer, Integer> entry1 : m1.entrySet()){
            for (Map.Entry<Integer, Integer> entry2 : m2.entrySet()){
                if (entry1.getValue() + entry2.getValue() == 558){
                    System.out.println(entry1.getKey());
                    break;
                }
            }
        }





    }

    public static int test(String temp){
        char[] arr = temp.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6'){
                arr[i] = '9';
                continue;
            }
            if (arr[i] == '9') {
                arr[i] = '6';
            }
        }

        char t;
        t = arr[0];
        arr[0] = arr[3];
        arr[3] = t;

        t = arr[2];
        arr[2] = arr[1];
        arr[1] = t;

        return Integer.parseInt(new String(arr));
    }
}
