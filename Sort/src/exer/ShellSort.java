package exer;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/7/4 20:46
 */
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[]{80, 90, 10, 70, 20, 30, 50, 40, 60, 5};
        shellSort(arr);
    }

    public static void shellSort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j = j - gap) {
                    if (arr[j] > arr[j + gap]) {
                        arr[j] = arr[j] ^ arr[j + gap];
                        arr[j + gap] = arr[j] ^ arr[j + gap];
                        arr[j] = arr[j] ^ arr[j + gap];
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
