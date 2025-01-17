package com.entity;

import org.springframework.stereotype.Component;

@Component("Airtel")
public class Airtel implements Sim {

	@Override
	public String calling() {
		return " u r calling from Airtel";
	}

}
