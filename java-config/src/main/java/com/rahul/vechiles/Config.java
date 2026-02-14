package com.rahul.vechiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("car.properties")
public class Config {
	
	@Bean
	public Vechile car() {
		Car car = new Car(festivalDiscountService());
		return car;
	}
	
	@Bean
	public DiscountService festivalDiscountService() {
		FestivalDiscountService festivalDiscountService = new FestivalDiscountService();
		return festivalDiscountService;
	}
}
