package com.innerclass;

import com.enums.Pizzasize;

public class Pizza {

	private static final Pizzasize SMALL = null;
	private static final Pizzasize MEDIUM = null;
	private static final Pizzasize LARGE = null;
	private String name;
	private Pizzasize pizzaSize;
	private double price;

	public Pizza(String name, Pizzasize pizzaSize) {
		this.name = name;
		this.pizzaSize = pizzaSize;
		this.price = calculatePrice();
	}

	class PizzaSlice {
		
		public String calculatePizzaSliceArea() {
			switch (pizzaSize) {
			case SMALL:
	         default:
				return "Small slice";
			case MEDIUM:
				return "Medium slice";
			case LARGE:
				return "Large slice";
			}
		}
	}

	public PizzaSlice cutPizzaSlice() {
		return new PizzaSlice();
	}

	private double calculatePrice() {
		switch (pizzaSize) {
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

	public Pizzasize getPizzaSize() {
		return pizzaSize;
	}

	public double getPrice() {
		return price;
	}
}
