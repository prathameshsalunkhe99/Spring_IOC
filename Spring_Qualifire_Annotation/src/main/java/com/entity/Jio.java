package com.entity;

import org.springframework.stereotype.Component;

@Component("Jio")
public class Jio implements Sim {

	@Override
	public String calling() {
		return "u r callling from jio";
	}

}
