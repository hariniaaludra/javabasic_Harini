package com.enums;

public class Pizza {
	private String name;
	private Pizzasize pizzasize;
	private double price;

	public Pizza(String name, Pizzasize pizzasize) {
		this.name = name;
		this.pizzasize = pizzasize;
		this.price = calculatePrice();
	}

	private double calculatePrice() {
		switch (pizzasize) {
		case SMALL:
		default:
			return 5.99;
		case MEDIUM:
			return 7.99;
		case LARGE:

			return 10.99;

		}

	}

	public String getName() {
		return name;
	}

	public Pizzasize getPizzasize() {
		return pizzasize;
	}

	public double getPrice() {
		return price;
	}
}
