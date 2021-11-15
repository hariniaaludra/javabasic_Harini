package com.hello;

class College{//super class
	void details() {
		System.out.println("Anna university");
	}
}
     class RankHolder extends College{//subclass name extends superclass
    	 void details(){
    		 System.out.println("RankHolder");
    	 }
     }
    	 class Student extends College {
    		 void details() {
    			 System.out.println("Student");
    		 }
    	 }
    	 public class Overridingexample {
    	     void details() {
    	    	 System.out.println("Harini");
    	     }
    		   
    		 public static void main(String[]args) {
    			 College obj=new College();
                RankHolder obj2=new RankHolder();
                Student obj1=new Student();
               
    				obj.details();
    				obj1.details();
    				obj2.details();
    				
    				
    	
    			
    			
    			
    			 
     }


}
