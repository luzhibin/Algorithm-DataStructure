package com.Person;

/**
 * Created by luzhibin on 2020/4/10 22:01
 */
public class Demo {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("小明");
        person1.setAge(18);
    }
}

class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
