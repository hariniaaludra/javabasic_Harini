package com.enum1;
enum Level{
	EASY,
	MEDIUM,
	HIGH;
}

public class Enumsample {
       public static void main(String[]args) {
    	  Level [] obj=Level.values();// array changed
    	  for(Level x:obj);// variable is not used
    	  for(Level objx :Level.values()){//loop through an enum
    		  System.out.println(objx);
    	  
    		  System.out.println(Level.valueOf("MEDIUM"));
    	  }
    	  }

}
