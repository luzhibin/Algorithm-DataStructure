package exer;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/7/2 22:25
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {60, 30, 70, 90, 50, 10, 40, 80};
        System.out.println("排序前：" + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if(left > right){
            return;
        }
        int base = arr[left];
        int i = left;
        int j = right;
        while(i!=j){
            while (arr[j] >= base && i<j){
                j--;
            }
            while (arr[i] <= base && i<j){
                i++;
            }
            if (i!=j){
                arr[i] = arr[i] ^ arr[j];
                arr[j] = arr[i] ^ arr[j];
                arr[i] = arr[i] ^ arr[j];
            }
        }
        arr[left] = arr[i];
        arr[i] = base;
        quickSort(arr, left, i-1);
        quickSort(arr, i+1, right);
    }
}
