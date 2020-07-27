package InsertSort;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/7/2 1:35
 */
public class InsertSort {
    public static void main(String[] args) {
        int arr[] = new int[]{20, 50, 30, 10, 40};
        insertSort(arr);
    }

    public static void insertSort(int[] arr){

        for (int i=1;i<arr.length;i++){
            int insertVal = arr[i];
            int insertIndex = i-1;
            while (insertIndex >= 0 && insertVal < arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = insertVal;

            System.out.println("第"+i+"轮插入："+ Arrays.toString(arr));

        }
    }
}
