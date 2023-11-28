package com.fact.springapp.di;

public class person implements PersonInterface{

    @Override
    public void begain() {
        System.out.println("I am person");
    }
}
