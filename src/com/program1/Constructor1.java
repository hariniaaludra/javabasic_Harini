package com.program1;

public class Constructor1 {
	static void main() {// though its an constructor but we did'nt create an object
		String name="Harini";
		byte age=22; // we can declare the int datatype in byte [eg:byte age=22;]
		System.out.println(name+" "+age);
	}
	static void method(int a,int b) {// this is also we declare the datatype as byte [eg:byte a,byte b]
		System.out.println(a+b);
	}
	public static void main(String[]args) {
		main(); // the object is create in here [eg:Constructor obj=new Constructor]
		method(10,20);
	}

}
