package QuickSort;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/7/2 22:26
 */
public class QuickSort2 {
    public static void main(String[] args) {
        int arr[] = {60,30,70,90,50,10,40,80};
        System.out.println("排序前："+ Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left > right){
            return;
        }
        int base = arr[left];
        int i = left;
        int j = right;
        while(i != j){
            while(arr[j] >= base && i<j){
                j--;    //j从右往左移动
            }
            while (arr[i] <= base && i<j){
                i++;    //i从左往右移动
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[left] = arr[i];
        arr[i] = base;
        //基准数归位后，排基准数的左边。
        quickSort(arr,left,i-1);
        //排基准数的右边
        quickSort(arr,i+1,right);

        System.out.println(Arrays.toString(arr));
    }
}
