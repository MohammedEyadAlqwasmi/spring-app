package com.fact.spring.ann;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String [] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        SportInterface sportInterface = context.getBean("tennis", SportInterface.class);
        sportInterface.mySport();
        context.close();
    }
}
