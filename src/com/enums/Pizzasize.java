package com.enums;

public enum Pizzasize {
	SMALL("Small size"),
	MEDIUM("Medium size"),
	LARGE("Large size");
	
	private String pizzasizeText;
	Pizzasize(String pizzasizeText){
		this.pizzasizeText = pizzasizeText;
	}
	public String getPizzasizeText() {
		return pizzasizeText;
	}
	

}
