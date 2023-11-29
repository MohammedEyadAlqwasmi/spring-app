package com.fact.springapp.di;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {

//      Person Person = new Person();
//      User user = new User(Person);
//      user.getPerson();

      ClassPathXmlApplicationContext context =
              new ClassPathXmlApplicationContext("applicationContext.xml");

      UserInterface userInterface = context.getBean("user", UserInterface.class);
      UserInterface userInterface1 = context.getBean("user", UserInterface.class);
      System.out.println(userInterface);
      System.out.println(userInterface1);
      System.out.println(userInterface == userInterface1);
//      PersonInterface personInterface = context.getBean("myPerson", PersonInterface.class);
//      personInterface.begain();
//      context.close();


  }
  }
