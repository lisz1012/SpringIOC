package com.lisz.factory;

import com.lisz.bean.Person;

public class PersonStaticFactory {
    public static Person getInstance(String name) {
        Person person = new Person();
        person.setId(1);
        person.setName(name);
        person.setAge(11);
        return person;
    }
}
