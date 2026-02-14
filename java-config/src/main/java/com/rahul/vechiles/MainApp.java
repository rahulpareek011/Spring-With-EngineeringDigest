package com.rahul.vechiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(Config.class);
		Vechile vc = acac.getBean("car",Vechile.class);
		System.out.println(vc.getMileage());
		System.out.println(vc.getDiscountMessage());
		System.out.println(vc.getMrp());
	}
}
