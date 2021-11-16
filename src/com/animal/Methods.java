package com.animal;

public class Methods {
	static void myMethod() {//static method
	String name="Harini";
	int id=13;
	String college="SNSCE";//static variable
	System.out.println(name+" "+id+" "+college);
	System.out.println("this is a static method");
	}
	public void Method() {//public method
		System.out.println("this is not a static method");
		
	}
	public static void main(String[]args) {
		myMethod();//call the static method
		Methods myobj=new Methods();
		myobj.Method();
	}
	

}
