package Java_2013.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @Author Qiao
 * @Create 2022/3/23 14:43
 */


//找出连续ID号的错号和重号
//输入N表示行数
//接着读入数据
public class _07错误票据 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int N = scan.nextInt();
        scan.nextLine(); //吃掉整数后面的换行符
        for (int i = 0; i < N; i++){
            String line = scan.nextLine();
            String[] split = line.split(" ");
            for (int j = 0; j < split.length; j++) {
                list.add(Integer.parseInt(split[j]));
            }
        }

        Collections.sort(list);
        int a = 0,b = 0;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i+1) - list.get(i) == 2){
                a = list.get(i) + 1;
            }
            if(list.get(i).equals(list.get(i + 1))){
                b = list.get(i);
            }
        }

        System.out.println(a + " " + b);
    }
}

