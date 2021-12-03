package com.classandobject;

import com.inheritance.Toyotasupra;

public class Carsapp {
public static void main(String[]args) {
	Dodgechallenger reddodgechallenger=new Dodgechallenger("red", (byte)3, (short)450, (short)717, (short)7700, 40000, 15000, true);
	reddodgechallenger.startTheEngine();
	
	  System.out.println("----------------------------------------------");
      Dodgechallenger orangeDodgeChallenger = new Dodgechallenger("orange", (byte)1, (short)392, (short)492, (short)6700, 30000, 10000, false);
      orangeDodgeChallenger.getDescription();
      orangeDodgeChallenger.startTheEngine();
      
      System.out.println("----------------------------------------------");
      Toyotasupra blackToyotaSupra = new Toyotasupra("black", (byte)1, (short)225, (short)717, (short)3500, 40000, 15000, false);
      blackToyotaSupra.getDescription();
      blackToyotaSupra.startTheEngine();
  }


  }


  




