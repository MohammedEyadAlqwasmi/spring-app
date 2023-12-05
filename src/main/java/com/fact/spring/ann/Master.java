package com.fact.spring.ann;

import org.springframework.stereotype.Component;

@Component("master")
public class Master implements MasterInterface{

    @Override
    public void name(){
        System.out.println("I am Master");
    }
}