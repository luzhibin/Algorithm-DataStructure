package com.Array;

/**
 * Created by luzhibin on 2020/4/12 10:36
 */

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Random;

/**练习数组反转
 * 首先创建一个长度是5的数组,并填充随机数。
 * 对这个数组实现反转效果
 */
public class ArrayInversion {

    public static void main(String[] args) {

    }

    /**
     * 方法一：使用临时数组
     */
    @Test
    public void method1(){
        int[] array = new int[5];
        System.out.println("【方法一】：\n数组的元素为");
        for (int i=0;i<array.length;i++){
            array[i] = (int) (Math.random()*100);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("数组反转后的元素为");
        //准备临时数组
        int[] temp = new int[array.length];
        for (int i=0;i<array.length;i++){
            temp[i] = array[array.length-i-1];
        }
        for (int i=0;i<temp.length;i++){
            array[i] = temp[i];
            System.out.print(array[i]+" ");
        }
    }

/*    @Test
    public void method2(){
        int[] array = new int[5];
        System.out.println("【方法一】：\n数组的元素为");
        for (int i=0;i<array.length;i++){
            array[i] = (int) (Math.random()*100);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("数组反转后的元素为");
        //准备临时数组
        int[] temp = new int[array.length];
        for (int i=0;i<array.length;i++){
            temp[i] = array[i];
        }
        for (int i=0;i<temp.length;i++){
            array[i] = temp[temp.length-i-1];
            System.out.print(array[i]+" ");
        }
    }*/

    @Test
    public void method2(){
        int[] array = new int[5];
        System.out.println("【方法二】：\n数组的元素为");
        for (int i=0;i<array.length;i++){
            array[i] = (int) (Math.random()*100);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("数组反转后的元素为");
        int middle;
        for (int i=0;i<array.length/2;i++){
            middle = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = middle;
        }
        for (int item : array){
            System.out.print(item+" ");
        }
    }

    @Test
    public void method3(){
        int[] array = new int[5];
        System.out.println("【方法三】：\n数组的元素为");
        for (int i=0;i<array.length;i++){
            array[i] = (int) (Math.random()*100);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("数组反转后的元素为");
        int middle;
        for (int i=0,j=array.length-1;i<j;i++,j--){
            middle = array[i];
            array[i] =array[j];
            array[j] = middle;
        }
        for (int item : array){
            System.out.print(item+" ");
        }
    }

    @Test
    public void method4(){
        int[] array = new int[5];
        System.out.println("【方法三】：\n数组的元素为");
        for (int i=0;i<array.length;i++){
            array[i] = (int) (Math.random()*100);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int item : array){
            System.out.println(array);
        }
    }
}
