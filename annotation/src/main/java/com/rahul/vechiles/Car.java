package com.rahul.vechiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myCar")
@Scope("prototype")
public class Car implements Vechile{
	
//	//most simple - field injection
//	@Autowired
//	@Qualifier("discountServiceImpl") -> used to avoid UnSatisfiedDependencyException coz there is multiple implementation spring confuse
	DiscountService discountService;
	
	@Value("${car.mrp}")
	private int mrp; 
	
	public String getMileage() {
		return "30kmpl";
	}
	
	public int getMrp() {
		return mrp;
	}
	
//	//constructor injection using annotation
//	@Autowired
//	public Car(@Qualifier("discountServiceImpl") DiscountService discountService) {
//		this.discountService = discountService;
//	}
	
	public String getDiscountMessage() {
		return discountService.getDiscountMessage();
	}

	//setter injection
	@Autowired
	@Qualifier("festivalDiscountServiceImpl")
	public void setDiscountService(DiscountService discountService) {
		this.discountService = discountService;
	}
}
