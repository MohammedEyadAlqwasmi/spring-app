package com.fact.spring.ann;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String [] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");


        MasterInterface master = context.getBean("master", MasterInterface.class);
        master.name();
        context.close();
    }
}
