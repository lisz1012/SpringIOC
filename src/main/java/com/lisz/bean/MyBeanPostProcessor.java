package com.lisz.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    // afterPropertiesSet或init-method之前
    // beanName就是xml里面bean的id属性
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization: " + beanName);
        return bean;
    }

    // afterPropertiesSet或init-method之后
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization: " + beanName);
        return bean;
    }
}
