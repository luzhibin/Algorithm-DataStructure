package com.Array;

import org.junit.Test;

/**
 * Created by luzhibin on 2020/3/27 21:02
 */
public class Array {

    @Test
    public void test(){
        int[] array = new int[3];
        for (int i=0;i<array.length;i++){
            array[i] = i;
        }
        for(int item : array){
            System.out.println("遍历array的元素："+item);
        }

        int[] array1 = {1,2,3,4,5,6};
        System.out.println("遍历array1的元素:");
        for (int item : array1){
            System.out.print(" "+ item);
        }


    }
}
