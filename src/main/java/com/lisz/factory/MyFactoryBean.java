package com.lisz.factory;

import com.lisz.bean.Person;
import org.springframework.beans.factory.FactoryBean;

public class MyFactoryBean implements FactoryBean<Person> {
    @Override
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setId(3);
        person.setName("王五");
        return person;
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }

    @Override
    public boolean isSingleton() {
        //不论是不是单例，都是什么时候用什么时候创建产品对象
        return true;
    }
}
