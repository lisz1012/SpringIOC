package com.lisz.factory;

import com.lisz.bean.Person;

public class PersonInstanceFactory {
    public Person getInstance(String name) {
        Person person = new Person();
        person.setId(2);
        person.setName(name);
        person.setAge(12);
        return person;
    }
}
