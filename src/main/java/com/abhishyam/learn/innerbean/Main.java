package com.abhishyam.learn.innerbean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rachana Rao on 7/2/2017.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.general();
        main.innerBean();
    }

    private void general() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("innerbean/general.xml");
        Customer customer = beanFactory.getBean("customer", Customer.class);
        System.out.println(customer.toString());
    }


    private void innerBean() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("innerbean/innerbean.xml");
        Customer customer = beanFactory.getBean("customer", Customer.class);
        System.out.println(customer.toString());
    }
}
