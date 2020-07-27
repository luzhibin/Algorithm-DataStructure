package BubbleSort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/6/30 18:22
 *
 * 冒泡排序
 */
public class BubbleSort2 {

    @Test
    public void test(){

        int arr[] = new int[]{3,9,-1,10,-2};

        for (int i=0;i<arr.length-1;i++){
            //System.out.println("i-----"+i);
            for (int j = 0;j<arr.length-1-i;j++){
                //System.out.println(arr.length-1-i);
                //如果前面的数比后面的数大，则交换
                if (arr[j] > arr[j+1]){
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
            System.out.println("第"+(i+1)+"次排序："+Arrays.toString(arr));
        }
    }

}
