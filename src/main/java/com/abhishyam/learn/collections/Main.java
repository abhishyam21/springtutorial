package com.abhishyam.learn.collections;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rachana Rao on 7/2/2017.
 */
public class Main {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("collections/applicationcontext.xml");
        Customer customer = beanFactory.getBean("customer", Customer.class);
        customer.printList();
        customer.printSet();
        customer.printMap();
    }
}
