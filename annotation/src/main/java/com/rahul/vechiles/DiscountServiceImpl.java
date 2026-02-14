package com.rahul.vechiles;

import org.springframework.stereotype.Component;

@Component
public class DiscountServiceImpl implements DiscountService{
	public String getDiscountMessage() {
		return "please contact to the customer care";
	}
}
