package com.fact.springapp.di;

public class User implements UserInterface {

    private PersonInterface person;


    @Override
    public void start(){
        System.out.println("I am user");
    }

    public void setPersonInjection(PersonInterface person){
        this.person = person;
    }
    @Override
   public void getPersonInjection(){
   this.person.begain();
   }
}
