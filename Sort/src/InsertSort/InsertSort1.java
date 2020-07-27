package InsertSort;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/7/1 20:38
 */
public class InsertSort1 {

    @Test
    public void test(){
        //插入排序的过程演示
        int arr[] = new int[]{101,34,119,1};

        //第一轮：{101,34,119,1} => {34,101,119,1}
        //定义待插入的数
        int insertVal = arr[1];
        int insertIndex = 1-1;  //即arr[1]的前面这个数的下标

        //给insertVal找到插入的位置
        //说明
        //1. insertIndex >= 0 保证在给insertVal 找插入位置，不越界
        //2.insertVal < arr[insertIndex] 待插入的数，还没有找到插入的位置
        //3.就需要将arr[insertIndex] 后移
        while (insertIndex >= 0 && insertVal < arr[insertIndex]){
            arr[insertIndex+1] = arr[insertIndex];
            insertIndex--;
        }
        //当退出while循环时，说明插入的位置找到 indexIndex + 1

        arr[insertIndex + 1] = insertVal;

        System.out.println("第1轮插入："+ Arrays.toString(arr));

        //第二轮
        //定义待插入的数
        insertVal = arr[2];
        insertIndex = 2-1;
        while (insertIndex >= 0 && insertVal < arr[insertIndex]){
            arr[insertIndex+1] = arr[insertIndex];
            insertIndex--;
        }
        arr[insertIndex + 1] = insertVal;
        System.out.println("第2轮插入："+ Arrays.toString(arr));

        //第三轮
        //第二轮
        //定义待插入的数
        insertVal = arr[3];
        insertIndex = 3-1;
        while (insertIndex >= 0 && insertVal < arr[insertIndex]){
            arr[insertIndex+1] = arr[insertIndex];
            insertIndex--;
        }
        arr[insertIndex + 1] = insertVal;
        System.out.println("第3轮插入："+ Arrays.toString(arr));
    }
}
