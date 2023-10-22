package com.fact.springapp.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("com/fact/springapp/ioc/applicationContext.xml");
        Sport sport = context.getBean("mySport", Sport.class);
        sport.start();
        context.close();

    }
}
