package com.enums;

public class Pizzaapp {
	public static void main(String[]args) {
		System.out.println("Available sizes:"); 
		for(Pizzasize pizzasize : Pizzasize.values()) {
			System.out.println("-"+pizzasize.getPizzasizeText());
		}
		System.out.println();
		Pizza pizzaOrder = new Pizza("Margaretta",Pizzasize.MEDIUM);
		System.out.println("I Orderd the following pizza:");
		System.out.println("Name: " + pizzaOrder.getName());
		System.out.println("Size: " + pizzaOrder.getPizzasize().getPizzasizeText());
		System.out.println("Price: $" + pizzaOrder.getPrice());
	}

}
