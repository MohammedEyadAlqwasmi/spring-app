package com.fact.springapp.di;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {

//
//      person person = new person();
//      User user = new User(person);
//      user.getPerson();

      ClassPathXmlApplicationContext context =
              new ClassPathXmlApplicationContext("com/fact/springapp/ioc/applicationContext.xml");

      UserInterface userInterface = context.getBean("myUser", UserInterface.class);
      userInterface.getPerson();

//      PersonInterface personInterface = context.getBean("myPerson", PersonInterface.class);
//      personInterface.begain();
//      context.close();


  }
  }
