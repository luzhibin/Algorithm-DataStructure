package BubbleSort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/6/30 22:38
 */
public class BubbleSort {

    public void bubbleSort(Integer[] arr, int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; ++i) {
            // 提前退出冒泡循环的标志位,即一次比较中没有交换任何元素，这个数组就已经是有序的了
            boolean flag = false;
            for (int j = 0; j < n - i - 1; ++j) {        //此处你可能会疑问的j<n-i-1，因为冒泡是把每轮循环中较大的数飘到后面
                // 数组下标又是从0开始的，i下标后面已经排序的个数就得多减1，总结就是i增多少，j的循环位置减多少
                if (arr[j] > arr[j + 1]) {  //即这两个相邻的数是逆序的，交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            //在一趟排序中，没有数据交换，数组已经有序，退出排序
            if (!flag){
                break;
            }else{
                flag = false;   //重置flag，进行下次判断
            }
        }
    }

    @Test
    public void test() {

        Integer arr[] = {3, 5, 8, 6, 7, 4, 9};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("排序前："+ Arrays.toString(arr));
        bubbleSort.bubbleSort(arr, arr.length);
        System.out.println("排序后："+Arrays.toString(arr));

    }
}
