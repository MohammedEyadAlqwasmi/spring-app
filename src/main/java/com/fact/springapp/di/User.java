package com.fact.springapp.di;

public class User implements UserInterface {

    private PersonInterface person;
    private String email;
    private String team;


    @Override
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getTeam() {
        return team;
    }
    public void setTeam(String team) {
        this.team = team;
    }

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

   public void doStar(){
       System.out.println("Start");
    }

    public void doEnd(){
        System.out.println("End");
    }
}
