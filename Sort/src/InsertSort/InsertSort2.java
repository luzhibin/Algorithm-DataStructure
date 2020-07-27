package InsertSort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/7/1 21:09
 */
public class InsertSort2 {

    public static void main(String[] args) {
        int arr[] = new int[]{20, 50, 30, 10, 40};
        insertSort(arr);
    }

    public static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];
            int insertIndex = i - 1;  //即arr[1]的前面这个数的下标

            //给insertVal找到插入的位置
            //说明
            //1. insertIndex >= 0 保证在给insertVal 找插入位置，不越界
            //2.insertVal < arr[insertIndex] 待插入的数，还没有找到插入的位置
            //3.就需要将arr[insertIndex] 后移
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            //当退出while循环时，说明插入的位置找到 indexIndex + 1

            arr[insertIndex + 1] = insertVal;

            System.out.println("第" + i + "轮插入：" + Arrays.toString(arr));

        }
    }
}
