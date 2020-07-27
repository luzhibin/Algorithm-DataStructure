package SelectSort;

        import org.junit.Test;

        import java.util.Arrays;

/**
 * Created by luzhibin on 2020/7/1 15:19
 *
 * 选择排序逐步演示
 */
public class SelectSort1 {

    public static void main(String[] args) {
        int arr[] = new int[]{101,34,119,1};
        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
    }

    public static void selectSort(int[] arr){

        //第1轮
        //原始数组：     101,34,119,1
        //第一轮排序：    1,34,119,101

        int minIndex = 0;   //先假定最小值的数组索引是0；
        int min = arr[0];   //假定数组的第一个元素是最小值
        for (int j = 0+1;j<arr.length;j++){
            if (min > arr[j]){  //说明假定的最小值 并不是最小
                min = arr[j];   //重置最小值
                minIndex = j;   //重置最小值的下标
            }
        }
        //将最小值，放在arr[0],即交换
        if (minIndex!=0){
            arr[minIndex] = arr[0];
            arr[0] = min;
        }
        System.out.println("第一轮后");
        System.out.println(Arrays.toString(arr));

        //第二轮排序：第一个最小值已经确定
        minIndex = 1;   //由于第一轮已经把最小值确定，并放在第[0]位，所以第二轮假定最小值的数组索引是1；
        min = arr[1];   //假定数组的第二个元素是最小值
        for (int j = 2;j<arr.length;j++){
            if (min > arr[j]){  //说明假定的最小值 并不是最小
                min = arr[j];   //重置最小值
                minIndex = j;   //重置最小值的下标
            }
        }
        //将最小值，放在arr[1],即交换
        if (minIndex!=1){
            arr[minIndex] = arr[1];
            arr[1] = min;
        }
        System.out.println("第二轮后");
        System.out.println(Arrays.toString(arr));

        //第三轮：前两个元素已经确定
        minIndex = 2;   //第三轮假定最小值的数组索引是2；
        min = arr[2];   //假定数组的第三个元素是最小值
        for (int j = 3;j<arr.length;j++){
            if (min > arr[j]){  //说明假定的最小值 并不是最小
                min = arr[j];   //重置最小值
                minIndex = j;   //重置最小值的下标
            }
        }
        //将最小值，放在arr[2],即交换
        if (minIndex!=2){
            arr[minIndex] = arr[2];
            arr[2] = min;
        }
        System.out.println("第三轮后");
        System.out.println(Arrays.toString(arr));
    }
}
