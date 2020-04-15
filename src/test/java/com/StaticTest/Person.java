package com.StaticTest;

/**
 * Created by luzhibin on 2020/4/12 0:19
 */
public class Person {

    private String name;
    private static String gender;
    private Integer age;


    private Person() {
    }

    private static void study(){
        System.out.println("人需要学习");
    }

    public static void main(String[] args) {
        Person staticTest3 = new Person();
        staticTest3.name="小明";
        staticTest3.gender="男";
        staticTest3.age=18;
        staticTest3.study();
    }
}
