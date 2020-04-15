package com.StaticTest;

/**
 * Created by luzhibin on 2020/3/31 13:56
 */
public class StaticTest {

    private static String name = "张三";  //静态成员变量
    private String address = "中国";      //非静态成员变量
    private static final String GENDER = "男"; //静态常量
    private final double height = 171.5;    //非静态常量

    /*非静态方法*/
    private void test(){
        System.out.println(name);       //访问静态成员变量
        System.out.println(address);    //访问非静态成员变量
        System.out.println(GENDER);     //访问静态常量
        System.out.println(height);     //访问非静态常量
        test1();
        test2();               //访问静态方法
        test3();                //访问静态方法
    }

    /*非静态方法*/
    private void test1(){
        System.out.println(name);       //访问静态成员变量
        System.out.println(address);    //访问非静态成员变量
        System.out.println(GENDER);     //访问静态常量
        System.out.println(height);     //访问非静态常量
        test();
        test2();
        test3();
    }

    private static void test2(){
        System.out.println(name);
        //System.out.println(address);       //报错
        System.out.println(GENDER);
        //System.out.println(height);        //报错
        //test1();                           //报错
        test3();
    }

    private static void test3(){
        System.out.println(name);
        System.out.println(GENDER);
        test2();
    }
}
