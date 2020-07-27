package InsertSort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/7/2 13:51
 */
public class InsertSort4 {

    public static void main(String[] args) {
        int arr[] = new int[]{20, 50, 30, 10, 40};
        insertSort(arr);
    }

    public static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                arr[j] = arr[j] ^ arr[j + 1];
                arr[j + 1] = arr[j] ^ arr[j + 1];
                arr[j] = arr[j] ^ arr[j + 1];
            }
            System.out.println("第" + i + "轮：" + Arrays.toString(arr));
        }
    }

    //丰哥的
    @Test
    public void insertionSort() {
        int arr[] = new int[]{20, 50, 30, 10, 40};
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
            System.out.println("第" + i + "轮：" + Arrays.toString(arr));
        }
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
}
