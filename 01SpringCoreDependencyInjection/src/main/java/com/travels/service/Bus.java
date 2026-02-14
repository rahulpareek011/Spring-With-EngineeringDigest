package com.travels.service;

public class Bus implements Vechile{
	
	DiscountService discountService;
	
	private String maximumRetailPrice;

	public String getMaximumRetailPrice() {
		return maximumRetailPrice;
	}

	public void setMaximumRetailPrice(String maximumRetailPrice) {
		this.maximumRetailPrice = maximumRetailPrice;
	}

	@Override
	public String getMileage() {
		return "Bus: 20kmpl";
	}
	
	public Bus() {
		System.out.println("default constructor");
	}
	
//	public Bus(DiscountService discountService) {//constructor DI
//		System.out.println("discountService object injected in Bus!");
//		this.discountService = discountService;
//	}
	
	public void setDiscountService(DiscountService discountService) {
		System.out.println("setter from car injecting discountService");
		this.discountService = discountService;
	}

	@Override
	public String getDiscountMessage() {
		return "Bus: "+this.discountService.getDiscountMessage();
	}

}
