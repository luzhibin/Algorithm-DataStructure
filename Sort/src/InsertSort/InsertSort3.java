package InsertSort;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/7/2 0:30
 */
public class InsertSort3 {

    public static void main(String[] args) {
        int arr[] = new int[]{20, 50, 30, 10, 40};
        insertSort(arr);
    }

    public static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                arr[j] = arr[j] ^ arr[j - 1];
                arr[j - 1] = arr[j] ^ arr[j - 1];
                arr[j] = arr[j] ^ arr[j - 1];
            }
            System.out.println("第" + i + "轮：" + Arrays.toString(arr));
        }
    }

    public static void insertSort2(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}