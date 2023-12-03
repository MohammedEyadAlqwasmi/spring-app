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
      System.out.println(userInterface.getEmail() + "  " + userInterface.getTeam());
//      PersonInterface personInterface = context.getBean("myPerson", PersonInterface.class);
//      personInterface.begain();
//      context.close();

      context.close();

  }
  }
