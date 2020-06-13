package com.lisz.bean;

import java.util.Date;

public class Person {
    private int id;
    private String name;
    private int age;
    private String gender;
    private Date date;

    // 当从从其中获取对象的时候，最好是保留无参数的构造方法，因为Spring是通过反射初始化bean的
    public Person() {
        System.out.println("Person 被创建");
    }

    public Person(int id, String name, int age, String gender, Date date) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.date = date;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("age...");
    }

    public Person(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        System.out.println("gender...");
    }

    // 用配置文件进行容器中对象初始化的时候setter不能省略，否则xml文件报错，因为它是通过setter的setXxx中的xxx注入，但是找不到setter
    // bean中要写id="xxx"，一般自动生成的setter没有这个问题
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                '}';
    }
}
