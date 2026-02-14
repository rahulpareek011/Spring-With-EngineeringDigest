package com.travels.service;

public class Car implements Vechile{
	
	private DiscountService discountService;
	private String maximumRetailPrice;

	public String getMaximumRetailPrice() {
		return maximumRetailPrice;
	}

	public void setMaximumRetailPrice(String maximumRetailPrice) {
		this.maximumRetailPrice = maximumRetailPrice;
	}

	@Override
	public String getMileage() {
		return "Car - 30kmpl";
	}
	
	public Car() {
		System.out.println("default constructor");
	}
	
//	public Car(DiscountService discountService) {//constructor DI
//		System.out.println("discountService object injected in Car!");
//		this.discountService = discountService;
//	}
	
	public void setDiscountService(DiscountService discountService) {
		System.out.println("setter from car injecting discountService");
		this.discountService = discountService;
	}

	@Override
	public String getDiscountMessage() {
		return "Car: " + this.discountService.getDiscountMessage();
	}

}
