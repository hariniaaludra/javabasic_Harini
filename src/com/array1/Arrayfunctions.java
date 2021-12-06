package com.array1;

import java.util.Arrays;

public class Arrayfunctions {
	public static void main(String[]args) {
		int[] gamerpoints=new int[12];
		System.out.println(Arrays.toString(gamerpoints));
		
		System.out.println("All the players start with 200 points:");
		Arrays.fill(gamerpoints, 200);
		System.out.println(Arrays.toString(gamerpoints));
		
		System.out.println("First 10 players lost 20 points:");
		Arrays.fill(gamerpoints,0,10,180);
		System.out.println(Arrays.toString(gamerpoints));
		
		System.out.println("The 10th player get 50 points");
		gamerpoints[9]+=50;
		System.out.println(Arrays.toString(gamerpoints));
		
		System.out.println("The gamerpoints in order:");
	    Arrays.sort(gamerpoints);
	    System.out.println(Arrays.toString(gamerpoints));
	    
	    System.out.println("The last 5 points:");
	    int[]lastFivepoints=Arrays.copyOf(gamerpoints, 5);
	    System.out.println(Arrays.toString(lastFivepoints));
	    
	    System.out.println("The top 5 points");
	    int[]topFivepoints=Arrays.copyOfRange(gamerpoints,gamerpoints.length-5,gamerpoints.length);
	    System.out.println(Arrays.toString(topFivepoints));
	    
	    if(Arrays.equals(lastFivepoints,topFivepoints)) {
	    	System.out.println("The last 5 points same as the top 5 points");
	    }else {
	    		System.out.println("The last 5 points don't have the same as the top 5 points");
	    	}
	    gamerpoints[4] = 300;
        Arrays.sort(gamerpoints);
        if (Arrays.binarySearch(gamerpoints, 300) >= 0) {
            System.out.println("Someone reached 300 points. The game is over!");
        } else {
            System.out.println("There is nobody who reached 300 points yet.");
        }
    }
}
