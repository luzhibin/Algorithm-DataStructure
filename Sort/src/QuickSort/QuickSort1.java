package QuickSort;

import javax.xml.transform.Source;
import java.util.Arrays;

/**
 * Created by luzhibin on 2020/7/2 19:18
 */
public class QuickSort1 {

    public static void main(String[] args) {
        int arr[] = {-9,78,0,23,-567,70};
        System.out.println("排序前："+Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
    }

    /*
    * 左标记的作用是找到一个比基准值pivot大的数字
    * 右标记的作用是找到一个比基准值pivot小的数字
    *
    * */

    public static void quickSort(int[] arr,int left,int right){
        int l = left;       //左下标
        int r = right;      //右下标
        //pivot 中轴值
        int pivot = arr[(left + right)/2];
        int temp;

        //while循环的目的：是让比pivot(中轴值)小的值放在左边，大的在右边
        while (l < r){
            while (arr[l] < pivot){
                l ++;
            }
            while (arr[r] > pivot){
                r --;
            }

            if (l >= r){
                break;
            }

            //交换
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            if (arr[l] == pivot){
                r--;
            }
            if (arr[r] == pivot){
                l++;
            }
        }

        //如果 l==r ,必须l++,r--，否则会出现栈溢出
        if (l==r){
            l++;
            r--;
        }

        //向左递归
        if(left < r){
            quickSort(arr, left, r);
        }

        //向右递归
        if (right > l){
            quickSort(arr, l, right);
        }

        System.out.println(Arrays.toString(arr));
    }
}
