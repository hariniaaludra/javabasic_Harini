package com.innerclass;

import com.enums.Pizzasize;

public class Innerclass {

	    private static boolean isPizzaReady(int waitedInMinutes) {
	        class Oven {
	            public boolean isPizzaBakedProperly() {
	                if (waitedInMinutes > 30) {
	                    return true;
	                }
	                return false;
	            }
	        }
	        Oven oven = new Oven();
	        return oven.isPizzaBakedProperly();
	    }

	    public static void main(String[] args) {
			Pizza firstPizza = new Pizza("Margherita", Pizzasize.MEDIUM);
	        System.out.println("Name: " + firstPizza.getName());
	        Pizza secondPizza = new Pizza("Margherita", Pizzasize.MEDIUM) {
	           
	        };
	        System.out.println("Name: " + secondPizza.getName());

	        if (isPizzaReady(40)){
	            System.out.println("The pizza is ready.");
	        } else {
	            System.out.println("The pizza is not ready yet.");
	        }

	        Pizza thirdPizza = new Pizza("Pizza cake", Pizzasize.LARGE);
	        Pizza.PizzaSlice pizzaSlice = thirdPizza.cutPizzaSlice();
	        System.out.println(pizzaSlice.calculatePizzaSliceArea());
	    }
	}


