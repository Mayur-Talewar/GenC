package com.example.coffeemachine;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("latteMachine")
@Scope("prototype")
public class LatteMachine implements CoffeeMachine {
    
    // public LatteMachine(){
    //     System.out.println("LatteMachine constructor called (prototype)");
    // }
    @Override
    public void brewCoffee(){
        System.out.println("Brewing a Latte");
    }
}
