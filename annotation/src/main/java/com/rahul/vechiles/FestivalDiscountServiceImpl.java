package com.rahul.vechiles;

import org.springframework.stereotype.Component;

@Component
public class FestivalDiscountServiceImpl implements DiscountService{
	@Override
	public String getDiscountMessage() {
		return "No discount";
	}

}
