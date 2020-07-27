package SelectSort;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/7/1 16:02
 */
public class SelectSort2 {

    public static void main(String[] args) {
        int arr[] = new int[]{101, 34, 119, 1, 20};
        System.out.println("排序前" + Arrays.toString(arr));
        System.out.println();
        selectSort(arr);
    }

    public static void selectSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;   //先假定最小值的数组索引是0；
            int min = arr[i];   //假定数组的第一个元素是最小值
            for (int j = i + 1; j < arr.length; j++) { //第一个数已经假定是最小值，所以从第二个数开始遍历
                if (min > arr[j]) {  //说明假定的最小值 并不是最小
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                arr[minIndex] = arr[i];//交换
                arr[i] = min;   //交换
            }
            System.out.println("第" + (i + 1) + "轮排序后" + Arrays.toString(arr));
        }
    }
}
