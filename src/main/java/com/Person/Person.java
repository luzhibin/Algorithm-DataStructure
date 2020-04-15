package com.Person;

/**
 * Created by luzhibin on 2020/4/10 21:18
 */
public class Person {

    // person类，下面是person的属性
    String name;        //姓名
    String gender;      //性别
    int age;            //年龄
    int height;         //身高
    String personId;    //身份证号

    //构造方法（无参构造）
    public Person() {
        super();
    }

    //构造方法  方法的重载【方法名一样，参数的类型、参数的个数不同称为方法重载】
    public Person(String name,String gender,Integer age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //构造方法  方法的重载【方法名一样，参数的类型、参数的个数不同称为方法重载】
    public Person(String name,String personId){
        this.name = name;
        this.personId = personId;
    }



    //打印个人信息
    public void showInfo(){
        System.out.println("个人信息-----------------------------");
        System.out.println("姓名："+name);
        System.out.println("性别："+gender);
        System.out.println("年龄："+age);
        System.out.println("身高："+height);
        System.out.println("身份证号："+personId);
    }
}
