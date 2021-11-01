package com.program1;

public class Class {//Access modifier
	protected int id=13;
	private String name="Harini";
	public void method() {
		System.out.println("Hello");
	}
	public static void main(String[]args) {
		Class obj=new Class();
		System.out.println(obj.name+" "+obj.id);
		obj.method();
		
	
	}

}
