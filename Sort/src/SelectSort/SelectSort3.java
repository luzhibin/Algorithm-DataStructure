package SelectSort;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/7/1 18:00
 */
public class SelectSort3 {

    public static void main(String[] args) {

        //测试选择排序的速度O(n^2)
        int[] arr = new int[8000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 800000);//生成一个[0,800000]的随机数
        }
        long startTime = System.currentTimeMillis();

        //开始排序
        selectSort(arr);

        long endTime = System.currentTimeMillis();
        System.out.println("所用时间为：" + (endTime - startTime) + "ms");
    }

    public static void selectSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int min = arr[i];
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];   //记录最小值
                    minIndex = j;   //记录下标
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }


}
