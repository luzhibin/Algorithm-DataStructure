package ShellSort;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/7/3 18:21
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arr = new int[]{80,90,10,70,20,30,50,40,60,0};
        shellSort(arr);
    }

    public static void shellSort(int[] arr){

        System.out.println("第1轮：");
        //希尔排序的第1轮排序
        //因为第1轮排序，是将10个数据分成5组
        for (int i=5;i<arr.length;i++){
            //遍历各组中所有的元素(共5组；每组有2个元素)
            //步长 = 5
            for (int j=i-5;j>=0;j=j-5){
                //如果当前元素大于加上步长后的元素，说明要交换
                if (arr[j]>arr[j+5]){
                    int temp = arr[j];
                    arr[j] = arr[j+5];
                    arr[j+5] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("第2轮：");
        //希尔排序的第2轮排序
        //第2轮排序，将10个数据分成 5/2=2 组
        for (int i=2;i<arr.length;i++){
            //遍历各组中所有的元素(共2组；每组有5个元素)
            //步长 = 2
            for (int j=i-2;j>=0;j=j-2){
                //如果当前元素大于加上步长后的元素，说明要交换
                if (arr[j]>arr[j+2]){
                    int temp = arr[j];
                    arr[j] = arr[j+2];
                    arr[j+2] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("第3轮：");
        //希尔排序的第3轮排序
        //第3轮排序，将10个数据分成 2/2=1 组
        for (int i=1;i<arr.length;i++){
            //遍历各组中所有的元素(共1组；每组有10个元素)
            //步长 = 1
            for (int j=i-1;j>=0;j=j-1){
                //如果当前元素大于加上步长后的元素，说明要交换
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }


    }
}
