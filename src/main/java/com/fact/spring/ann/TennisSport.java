package com.fact.spring.ann;

import com.fact.spring.ioc.Sport;
import org.springframework.stereotype.Component;

@Component("tennis")
public class TennisSport implements SportInterface {

    @Override
    public void mySport() {
        System.out.println("I am Tennis");
    }
}
