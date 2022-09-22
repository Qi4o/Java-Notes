package sort;

import java.util.Arrays;

/**
 * @Author Qiao
 * @Create 2022/3/16 10:40
 */

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {-9,78,0,23,-567,70,-5,-7};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right){
        int l = left;
        int r = right;
        int pivot = arr[(left + right)/2];  //pivot 中轴
        int temp = 0;   //临时变量

        //while循环的目的是让比pivot小的放在左边，比pivot大的放在右边
        while (l < r) {
            //在pivot左边找，一直找到比pivot大的值才推出
            while(arr[l] < pivot){
                l++;
            }
            //在pivot右边找，一直找到比pivot小的值才推出
            while(arr[r] > pivot){
                r--;
            }
            //如果l >= r说明pivot的左右两值已经全部是分类好的
            if(l >= r){
                break;
            }
            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            //如果交换完后，发现arr[l] == pivot，前移
            if(arr[l] == pivot){
                r--;
            }
            //如果交换完后，发现arr[r] == pivot，后移
            if(arr[r] == pivot){
                l++;
            }
        }

        //如果l == r，必须l++， r--，否则会出现栈溢出
        if(l==r){
            l++;
            r--;
        }

        //向左递归
        if (left < r){
            quickSort(arr,left,r);
        }

        //向右递归
        if (right > l){
            quickSort(arr,l,right);
        }

    }
}
