package com.Array;

/**
 * Created by luzhibin on 2020/4/12 10:42
 */

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

/** 练习-数组最小值
 *  首先创建一个长度是5的数组
 *  然后给数组的每一位赋予随机整数
 *  找出最小的一个值出来
 */
public class ArrayMinimum {

    public static void main(String[] args) {

    }

    @Test
    public void method1(){
        int array[] = new int[5];
        System.out.println("数组的元素为：");
        for (int i=0;i<array.length;i++){
            array[i] = (int) (Math.random()*100);
            System.out.println(array[i]);
        }
        System.out.println("----------------------------------------------------");
        //方法一：
        int target = 100;
        for(int j=1;j<array.length;j++){
            int value = array[j];
            System.out.println("value:"+value);
            if (value<target){
                target = value;
                System.out.println("target:"+target);
            }
    }
        System.out.println("方法一，最小值为："+target);
}

    @Test
    public void method2(){
        int array[] = new int[5];
        System.out.println("数组的元素为：");
        for (int i=0;i<array.length;i++){
            array[i] = (int) (Math.random()*100);
            System.out.println(array[i]);
        }
        System.out.println("----------------------------------------------------");
        int min = array[0];
        for(int i=1;i<array.length;i++)
        {
            if(min>array[i]){
                min=array[i];
            }

        }
        System.out.println("方法二：最小值为："+min);
    }

    @Test
    public void method3(){
        Integer array[] = new Integer[5];
        System.out.println("数组的元素为：");
        for (int i=0;i<array.length;i++){
            array[i] = (int) (Math.random()*100);
            System.out.println(array[i]);
        }
        System.out.println("----------------------------------------------------");
        //对数组进行排序处理
        Arrays.sort(array);
        System.out.println("方法三：最小值为："+array[0]);
    }

    @Test
    public void method4(){
        Integer array[] = new Integer[5];
        System.out.println("数组的元素为：");
        for (int i=0;i<array.length;i++){
            array[i] = (int) (Math.random()*100);
            System.out.println(array[i]);
        }
        System.out.println("----------------------------------------------------");
        //通过 Collections 类的 Collections.max() 和 Collections.min() 方法来查找数组中的最大和最小值：
        int min = (int)Collections.min(Arrays.asList(array));
        int max = (int) Collections.max(Arrays.asList(array));
        System.out.println("方法四：最小值为："+min);
        System.out.println("方法四：最大值为："+max);
    }
}
