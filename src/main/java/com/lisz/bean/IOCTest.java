package com.lisz.bean;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 容器中的对象是什么时候创建的？
// 在容器创建完成之前就创建好了（懒加载先不考虑）
public class IOCTest {
    public static void main(String[] args) throws Exception{
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
        Person person7 = context.getBean("person7", Person.class);
        System.out.println(person7);
        Person person8 = context.getBean("person8", Person.class);
        System.out.println(person8);
        /*报错，无法使用list标签里面定义的内部bean
        Address address4 = context.getBean("address4", Address.class);
        System.out.println(address4);*/
        Person child = context.getBean("child", Person.class);
        System.out.println(child);
        /*bean标签里写 abstract="true"会报错，抽象的，无法实例化*/
        Person parent = context.getBean("parent", Person.class);
        System.out.println(parent);
        // scope="singleton/prototype"测试
        Person person10 = context.getBean("person10", Person.class);
        Person person11 = context.getBean("person10", Person.class);
        System.out.println(person10 == person11);
        Person staticPerson = context.getBean("staticPerson", Person.class);
        System.out.println(staticPerson);
        Person instancePerson = context.getBean("instancePerson", Person.class);
        System.out.println(instancePerson);
        //用beanFactory的id取得Person对象
        //Person myBeanFactoryPerson = context.getBean("myBeanFactory", Person.class);
        //System.out.println(myBeanFactoryPerson);
        Person person12 = context.getBean("person12", Person.class);
        System.out.println(person12);
        DruidDataSource dataSource = context.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource);
        System.out.println(dataSource.getConnection());
        DruidDataSource dataSource2 = context.getBean("dataSource2", DruidDataSource.class);
        System.out.println(dataSource2);
        System.out.println(dataSource2.getConnection());

        Person person13 = context.getBean("person13", Person.class);
        System.out.println(person13);

        Person person14 = context.getBean("person14", Person.class);
        System.out.println(person14);

        Person person15 = context.getBean("person15", Person.class);
        System.out.println(person15);

        ((ClassPathXmlApplicationContext)context).close();
    }
}
