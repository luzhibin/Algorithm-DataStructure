package com.Array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Created by luzhibin on 2020/3/21 10:13
 */
//数组的用法
public class ArrayIntroduction {

    @Test
    public void test1(){
        // 1. Initialize
        int[] a0 = new int[5];
        int[] a1 = {1, 2, 3,4,5};
        // 2. Get Length
        System.out.println("The size of a0 is: " + a0.length);
        System.out.println("The size of a1 is: " + a1.length);
        // 3. 访问元素
        System.out.println("The first element of a0 is: " + a0[0]);
        System.out.println("The first element of a1 is: " + a1[0]);
        // 4. 迭代所有元素
        System.out.print("[Version 1] The contents of a1 are:");
        for (int i = 0; i < a1.length; i++) {
            System.out.print(" " + a1[i]);
        }
        System.out.println("\n Version2：增强for循环");
        System.out.print("[Version 2] The contents of a1 are:");
        for (int item: a1) {
            System.out.print(" " + item);
        }
        System.out.println();
        // 5. 修改元素
        a1[0] = 4;
        // 6. 排序
        Arrays.sort(a1);
        System.out.println("排序后的数组：");
        for (int j = 0; j < a1.length;j++){
            System.out.print(" " + a1[j]);
        }
    }
}
