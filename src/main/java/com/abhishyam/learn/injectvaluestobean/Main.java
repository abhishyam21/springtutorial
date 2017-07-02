package com.abhishyam.learn.injectvaluestobean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Rachana Rao on 7/2/2017.
 */
public class Main {
    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("injectvaluestobean/normalway.xml");
        FileNameGenerator fileNameGen = beanFactory.getBean("fileNameGen", FileNameGenerator.class);
        System.out.println(fileNameGen.getName()+"\t"+fileNameGen.getType());
    }
}
