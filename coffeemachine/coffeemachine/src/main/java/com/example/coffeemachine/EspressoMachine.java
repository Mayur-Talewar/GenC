package com.example.coffeemachine;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Qualifier("espressoMachine")
@Scope("singleton")
public class EspressoMachine implements CoffeeMachine{
    public EspressoMachine(){
        System.out.println("EspressMachine Constructor called");
    }

    @Override
    public void brewCoffee() {
        System.out.println("Brewing Espresso");
        
    }
    
}
