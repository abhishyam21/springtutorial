package com.abhishyam.learn.injectvaluestobean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This is the main class to execute the program.
 * Here we dealing with setting values to bean in different way.
 * Each method in class define each of setting
 *
 * Created by Rachana Rao on 7/2/2017.
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.normalWay();
        main.shortcut();
        main.pSchema();
    }

    /**
     * Normal way to set properties to a bean
     */
    private void normalWay() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("injectvaluestobean/normalway.xml");
        FileNameGenerator fileNameGen = beanFactory.getBean("fileNameGen", FileNameGenerator.class);
        System.out.println("Values set through Normal way");
        System.out.println(fileNameGen.getName()+"\t"+fileNameGen.getType());
    }

    /**
     * Short cut way to set bean values
     */
    private void shortcut() {
            BeanFactory beanFactory = new ClassPathXmlApplicationContext("injectvaluestobean/shortcutway.xml");
        FileNameGenerator fileNameGen = beanFactory.getBean("fileNameGen", FileNameGenerator.class);
        System.out.println("Values set through ShortCut way");
        System.out.println(fileNameGen.getName()+"\t"+fileNameGen.getType());
    }


    private void pSchema() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("injectvaluestobean/pschemaway.xml");
        FileNameGenerator fileNameGen = beanFactory.getBean("fileNameGen", FileNameGenerator.class);
        System.out.println("Values Set through P Schema");
        System.out.println(fileNameGen.getName()+"\t"+fileNameGen.getType());
    }
}
