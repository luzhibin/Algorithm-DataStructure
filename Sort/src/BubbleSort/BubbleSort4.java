package BubbleSort;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/6/30 23:20
 *
 * 将前面的冒泡排序算法，封装成一个方法
 */
public class BubbleSort4 {

    public static void main(String[] args) {

        //测试冒泡排序的速度O(n^2)
        int[] arr = new int[8000];
        for (int i=0;i<arr.length;i++){
            arr[i] = (int) (Math.random()*800000);//生成一个[0,800000]的随机数
        }

        long startTime = System.currentTimeMillis();
        //System.out.println("排序前："+ Arrays.toString(arr));

        //测试冒泡排序
        bubbleSort(arr);

        //System.out.println("排序后："+ Arrays.toString(arr));

        long endTime = System.currentTimeMillis();
        System.out.println("所用时间为："+(endTime-startTime));

    }

    public static void bubbleSort(int[] arr){

        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0;j<arr.length-1-i;j++){
                if (arr[j] > arr[j+1]){
                    flag = true;
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];
                }
            }
            if (!flag){
                break;
            }else{
                flag = false;
            }
        }
    }
}
