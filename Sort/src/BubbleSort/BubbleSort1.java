package BubbleSort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/6/30 18:09
 *
 * 冒泡排序
 */
public class BubbleSort1 {

    @Test
    public void test(){

        int arr[] = new int[]{3,9,-1,10,-2};

        //第一趟排序，将最大的数排在最后（即10在最后）
        int temp = 0;//临时变量  用作交换
        for (int j = 0;j<arr.length-1;j++){
            //如果前面的数比后面的数大，则交换
            if (arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println("第1次排序后的数组："+Arrays.toString(arr));

        //第二趟排序，第二大的数排在倒数第二位（即9在倒数第二位）
        for (int j = 0;j<arr.length-2;j++){
            //如果前面的数比后面的数大，则交换
            if (arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println("第2次排序后的数组："+Arrays.toString(arr));

        //第三趟排序，3排在第三位
        for (int j = 0;j<arr.length-3;j++){
            //如果前面的数比后面的数大，则交换
            if (arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println("第3次排序后的数组："+Arrays.toString(arr));

        //第四趟排序，-1排在第二位
        for (int j = 0;j<arr.length-4;j++){
            //如果前面的数比后面的数大，则交换
            if (arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        System.out.println("第4次排序后的数组："+Arrays.toString(arr));
    }

}
