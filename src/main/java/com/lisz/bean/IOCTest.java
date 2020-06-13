package com.lisz.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 容器中的对象是什么时候创建的？
// 在容器创建完成之前就创建好了（懒加载先不考虑）
public class IOCTest {
    public static void main(String[] args) {
        // 对于Maven项目，要把ioc.xml放在resources资源目录里才能找得到. ApplicationContext是IOC容器的入口
        // 创建该类才能拿对象，他有两个子类实现：ClassPathXmlApplicationContext表示从classpath读数据，常用
        // FileSystemXmlApplicationContext表示从当前文件系统读数据。默认容器启动之后Person对象就已经创建完成了
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
        Person person2 = context.getBean("person", Person.class);
        System.out.println(person == person2); // 默认是单例true，除非bean标签里面写了 scope="prototype".实际就是Map存储beans
        // scope="prototype"的时候会"懒加载"
        //Person p = context.getBean(Person.class);// 多个Person类型的不同id的bean的时候，会报错，Spring不知道该注入哪一个
        Person person3 = context.getBean("person3", Person.class);
        System.out.println(person3);
        Person person4 = context.getBean("person4", Person.class);
        System.out.println(person4);
        Person person5 = context.getBean("person5", Person.class);
        System.out.println(person5);
        Person person6 = context.getBean("person6", Person.class);
        System.out.println(person6);
    }
}
