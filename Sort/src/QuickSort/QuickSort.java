package QuickSort;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/7/2 21:04
 */
public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {60,30,70,90,50,10,40,80};
        System.out.println("排序前："+ Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
    }

    /*
     * 左标记的作用是找到一个比基准值pivot大的数字
     * 右标记的作用是找到一个比基准值pivot小的数字
     *
     * */

    public static void quickSort(int[] arr,int left,int right){
        //进行判断，left不能比right大
        if(left > right){
            return;
        }
        //定义变量保存基准数
        int base = arr[left];
        //定义变量i，指向最左边
        int i = left;
        //定义变量j，指向最右边
        int j = right;

        //当i和j不相遇时，在循环中进行检索
        while(i != j){
            //先由j从右往左检索比基准数小的，如果检索到比基准数小的就停下
            //也就是说如果检索到比基准数大的或者相等的，就继续检索
            while(arr[j] >= base && i<j){
                j--;    //j从右往左移动
            }
            //i从左往右检索比基准数大的
            while (arr[i] <= base && i<j){
                i++;    //i从左往右移动
            }

            //代码走到这里，说明i和j都停下了，然后交换i和j位置的元素
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //代码走到这里 说明 i=j
        // i和j相遇了，交换基准数和相遇位置的元素
        arr[left] = arr[i];
        arr[i] = base;
        //基准数在这里归位了，左边的数字都比他小，右边的数字都比他大
        //基准数归位后，排基准数的左边。
        quickSort(arr,left,i-1);
        //排基准数的右边
        quickSort(arr,i+1,right);

        System.out.println(Arrays.toString(arr));

    }
}
