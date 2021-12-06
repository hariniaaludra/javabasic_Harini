package com.mathfunctions;

public class Mathfunctions {
	public static void main(String[]args) {
		double temperatureyesterday=-5.6;
		double temperaturetoday=-Math.random()*10;
		
		System.out.println("Absolute temperature today:"+Math.abs(temperaturetoday));
		System.out.println("Min:"+Math.min(temperatureyesterday, temperaturetoday));
		System.out.println("Max:"+Math.max(temperatureyesterday, temperaturetoday));
		System.out.println("Round:"+Math.round(temperaturetoday));
		System.out.println("Ceiling:"+Math.ceil(temperaturetoday));
		System.out.println("Floor:"+Math.floor(temperaturetoday));
		System.out.println("Power:"+Math.pow(temperatureyesterday, 2));
		System.out.println("Square root:"+Math.sqrt(Math.abs(temperaturetoday)));
	}

}
