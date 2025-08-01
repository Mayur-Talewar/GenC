package com.example.coffeemachine;

import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.slf4j.Logger;

public class CoffeemachineApplication {

	public static void main(String [] args){
		final Logger logger = LoggerFactory.getLogger(LatteMachine.class);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		//Espresso via CafeService(singleton)- One espresso brewed through dependency injection
		CafeService cafeService =context.getBean(CafeService.class);
		cafeService.serveCoffee();

		// Latte (prototype)- Two latte brewed independently via prototype bean
		CoffeeMachine latte1 = context.getBean("latteMachine", CoffeeMachine.class);
		latte1.brewCoffee(); // Brewing a Latte 

		CoffeeMachine latte2 = context.getBean("latteMachine", CoffeeMachine.class);
		latte2.brewCoffee(); // Brewing a Latte again, with new instance

		System.out.println(latte1);
		System.out.println(latte2);

        System.out.println("Is latte1 and latte2 same instance? Ans:" + (latte1==latte2));

		logger.info("Are both beans the same instance? {}", (latte1 == latte2));
        logger.debug("Bean 1: {}", latte1);
        logger.debug("Bean 2: {}", latte2);
		context.close();
	}

}
