package com.StaticTest;

/**
 * Created by luzhibin on 2020/4/10 15:49
 */
public class StaticTest2 {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        swap(x,y);
        System.out.println("x的值是："+x);
        System.out.println("y的值是："+y);
    }

    public static void swap(int m , int n){
        int t = m;
        m = n;
        n = t;
    }

}
