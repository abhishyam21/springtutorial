package com.abhishyam.learn.date;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rachana Rao on 7/2/2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("date/date.xml");
        SimpleDate date = context.getBean("date", SimpleDate.class);
        System.out.println(date);
    }
}
