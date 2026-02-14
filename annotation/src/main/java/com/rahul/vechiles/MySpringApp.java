package com.rahul.vechiles;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Car vc = ac.getBean("myCar",Car.class);
		System.out.println(vc.getMileage());
		System.out.println(vc.getDiscountMessage());
		System.out.println(vc.getMrp());
		
		//using @Scope
		Car vc2 = ac.getBean("myCar",Car.class);
		System.out.println(vc==vc2);
	}

}
