package BubbleSort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/6/30 21:44
 *
 * 冒泡排序的优化：如果我们发现在某趟排序中，没有发生一次交换， 可以提前结束冒泡排序
 * 冒泡排序的时间复杂度 O(n^2)
 */
public class BubbleSort3 {

    @Test
    public void test(){

        int[] arr = new int[]{3,9,-1,10,-2};

        boolean flag = false;//标识符，表示是否进行过交换
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j] > arr[j+1]){
                    flag = true;
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
            if (!flag){  //在一趟排序中，一次交换都没有发生过
                break;
            }else{
                flag = false;//重置标志位，进行下次判断
            }
            System.out.println("第"+(i+1)+"次排序："+Arrays.toString(arr));
        }
    }
}
