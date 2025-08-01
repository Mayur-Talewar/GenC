package com.example.coffeemachine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class CafeService{
    private final CoffeeMachine coffeeMachine;

    @Autowired
    public CafeService(@Qualifier("espressoMachine") CoffeeMachine coffeeMachine){
        this.coffeeMachine=coffeeMachine;
        System.out.println("CafeService Constructor: CoffeeMachine injected");
    }

    public void serveCoffee(){
        coffeeMachine.brewCoffee();
    }

    @PostConstruct
    public void init(){
        System.out.println("CafeService Ready");
    }

    @PreDestroy
    public void clean(){
        System.out.println("CafeService Closed");
    }
}