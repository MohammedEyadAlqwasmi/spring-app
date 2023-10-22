package com.fact.springapp.di;

public class User implements UserInterface {

    private PersonInterface person;

    public User(PersonInterface person){
        this.person = person;
    }

    @Override
    public void start(){
        System.out.println("I am user");
    }

    @Override
   public void getPerson(){
   this.person.begain();
   }
}
