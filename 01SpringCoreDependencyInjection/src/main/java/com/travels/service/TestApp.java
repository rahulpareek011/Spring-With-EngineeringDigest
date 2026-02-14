package com.travels.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Car c = (Car)ac.getBean("myCar");
		System.out.println(c.getMileage());
		System.out.println(c.getDiscountMessage());
		
		System.out.println();
		
		Bus b = (Bus)ac.getBean("myBus");
		System.out.println(b.getMileage());
		System.out.println(c.getDiscountMessage());
		
		System.out.println();
	
		Vechile vechile = ac.getBean("myCar",Vechile.class);
		System.out.println(vechile.getMileage());
		System.out.println(vechile.getDiscountMessage());
		System.out.println(vechile.getMaximumRetailPrice());
		
		System.out.println();
		
		//bean scope
		Vechile vechile2 = ac.getBean("myCar",Vechile.class);
		System.out.println(vechile==vechile2);//true - bydefault scope follows singleton
		//changing in bean.xml --> scope="prototype" -> result -> false
		
		
	}

}
