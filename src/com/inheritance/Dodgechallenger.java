package com.inheritance;

public class Dodgechallenger extends Car {
	public Dodgechallenger(String color, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity,
            int price, int mileage, boolean isDamaged){
super("Dodge Challenger", color, numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged);
}
	  public void startTheEngine() {
	        System.out.println("A Dodge Challenger engine is started.");
	    }

}
