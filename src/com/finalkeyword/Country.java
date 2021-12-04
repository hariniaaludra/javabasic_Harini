package com.finalkeyword;	

	public class Country {

	    private final String name = "India";
	    private int population;
	    private String capital;

	    public String country1( int population, String capital) {
			return population + capital;
	         
	    }

	    public final int populationChange(int change){
	        return population += change;
	    }
	    public static void main(String[]args) {
	    	Country country=new Country();
	    	
	    	System.out.println(country.populationChange(78978970));
	    }
	}


