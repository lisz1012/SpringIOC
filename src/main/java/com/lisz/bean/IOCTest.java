package com.lisz.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 容器中的对象是什么时候创建的？
// 在容器创建完成之前就创建好了
public class IOCTest {
    public static void main(String[] args) {
        // 对于Maven项目，要把ioc.xml放在resources资源目录里才能找得到. ApplicationContext是IOC容器的入口
        // 创建该类才能拿对象，他有两个子类实现：ClassPathXmlApplicationContext表示从classpath读数据，常用
        // FileSystemXmlApplicationContext表示从当前文件系统读数据
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
}
