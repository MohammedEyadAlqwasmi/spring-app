package com.fact.springapp.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Sport sport = context.getBean("sport", Sport.class);
        sport.start();
        context.close();

    }
}
