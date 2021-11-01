package com.hello;

class Method1{//super class
	void method() {
		System.out.println("Anna university");
	}
}
     class RankHolder extends Method1{//subclass name extends superclass
    	 void method(){
    		 System.out.println("RankHolder");
    	 }
     }
    	 class Student extends Method1{
    		 void method() {
    			 System.out.println("Student");
    		 }
    	 }
    	 public class Overriding {
    	     void Method() {
    	    	 System.out.println("Harini");
    	     }
    		   
    		 public static void main(String[]args) {
    			 Method1 obj=new Method1();
                RankHolder obj2=new RankHolder();
                Student obj1=new Student();
               
    				obj.method();
    				obj1.method();
    				obj2.method();
    				
    				
    	
    			
    			
    			
    			 
     }


}
