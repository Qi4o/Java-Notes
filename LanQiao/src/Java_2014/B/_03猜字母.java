package Java_2014.B;

import java.util.ArrayList;

/**
 * @Author Qiao
 * @Create 2022/3/30 23:25
 */


    //把abcd...s共19个字母组成的序列重复拼接106次，得到长度为2014的串
    //删除第1个字母，以及第3个，第5个等所有奇数位的字母
    //得到新的串再进行删除奇数位的，直到只剩一个字母
public class _03猜字母 {
    public static void main(String[] args) {
        ArrayList<Character> arr = new ArrayList<>();
        String str = "abcdefghijklmnopqrs";
        for (int i = 0; i < 106; i++) {
            for (int j = 0; j < str.length(); j++) {
                arr.add(str.charAt(j));
            }
        }

        while (true) {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.size() == 1){
                    break;
                }
                arr.remove(i);
            }
            if (arr.size() == 1){
                break;
            }
        }
        System.out.println(arr.toString());
        
    }
}
