package com.Demo;

import org.junit.jupiter.api.Test;

/**
 * Created by luzhibin on 2020/4/15 14:54
 */
/*  输出100以内的所有质数
*   质数：也叫素数，只能被1和他本身整除的自然数
*   最小的质数：2
* */
public class PrimeNumber {
    public static void main(String[] args) {
    }

    //方法一，效率最低
    @Test
    public void method1(){
        //获取当前时间距离1970-01-01 00:00:00的毫秒数
        long start = System.currentTimeMillis();
        boolean b = true;
        //遍历100以内的自然数
        for (int i = 2;i<=100000;i++){
            //j：被i去除
            for (int j=2;j<i;j++){
                if (i % j == 0){    //%是求模运算，即2%10=2，10%2=0，10%3=1。
                    b = false;
                }
            }
            if (b){
                System.out.print(i+" ");
            }
            b = true;
        }
        //获取当前时间距离1970-01-01 00:00:00的毫秒数
        long end = System.currentTimeMillis();
        System.out.println("\n花费时间："+(end-start));  //21808毫秒
    }

    //对方法一进行优化
    @Test
    public void method2(){
        //获取当前时间距离1970-01-01 00:00:00的毫秒数
        long start = System.currentTimeMillis();
        //遍历100以内的自然数
        for (int i = 2;i<=100000;i++){
            boolean b = true;
            //优化二：对本身是质数的自然数是有效的
            for (int j=2;j<i;j++){
                if (i % j == 0){    //%是求模运算，即2%10=2，10%2=0，10%3=1。
                    b = false;
                    break;//优化一：只对本身非质数的自然数是有效的
                }
            }
            if (b){
                System.out.print(i+" ");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("\n花费时间："+(end-start));  //优化一后：花费时间 1521ms
    }

    @Test
    public void method3(){
        //获取当前时间距离1970-01-01 00:00:00的毫秒数
        long start = System.currentTimeMillis();
        //遍历100以内的自然数
        for (int i = 2;i<=100000;i++){
            boolean b = true;
            //优化二：对本身是质数的自然数是有效的
            for (int j=2;j<Math.sqrt(i);j++){
                if (i % j == 0){    //%是求模运算，即2%10=2，10%2=0，10%3=1。
                    b = false;
                }
            }
            if (b){
                System.out.print(i+" ");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("\n花费时间："+(end-start));  //优化二：243ms
    }

    //对方法一进行优化
    @Test
    public void method4(){
        //获取当前时间距离1970-01-01 00:00:00的毫秒数
        long start = System.currentTimeMillis();
        //遍历100以内的自然数
        for (int i = 2;i<=100000;i++){
            boolean b = true;
            //优化二：对本身是质数的自然数是有效的
            for (int j=2;j<Math.sqrt(i);j++){
                if (i % j == 0){    //%是求模运算，即2%10=2，10%2=0，10%3=1。
                    b = false;
                    break;//优化一：只对本身非质数的自然数是有效的
                }
            }
            if (b){
                System.out.print(i+" ");
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("\n花费时间："+(end-start));  //优化一加优化二：84ms
    }

    @Test
    public void method5(){
        //获取当前时间距离1970-01-01 00:00:00的毫秒数
        long start = System.currentTimeMillis();
        //遍历100以内的自然数
        label:for (int i = 2;i<=100000;i++){
            boolean b = true;
            //优化二：对本身是质数的自然数是有效的
            for (int j=2;j<Math.sqrt(i);j++){
                if (i % j == 0){    //%是求模运算，即2%10=2，10%2=0，10%3=1。
                    continue label;
                }
            }
            System.out.print(i+" ");
        }
        long end = System.currentTimeMillis();
        System.out.println("\n花费时间："+(end-start));  //优化一加优化二：84ms
    }
}
