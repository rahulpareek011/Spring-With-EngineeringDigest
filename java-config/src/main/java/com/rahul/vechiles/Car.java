package com.rahul.vechiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

//import org.springframework.stereotype.Component;

//@Component -> lets write manually bean in config -> where configuration exist
public class Car implements Vechile{
	
	//@Autowired -> with autowired done construtor injection in configuration file
	private DiscountService discountService;
	@Value("${car.mrp}")
	private int mrp;
	
	public Car(DiscountService discountService) {
		this.discountService = discountService;
	}
	
	public String getMileage() {
		return "Car: 20kmpl";
	}
	
	public String getDiscountMessage() {
		return discountService.getDiscounMessage();
	}
	
	@Override
	public int getMrp() {
		return this.mrp;
	}
}
