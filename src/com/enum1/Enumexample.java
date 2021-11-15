package com.enum1;

enum Color{//outside the class
	RED,
	BLUE,
	GREEN;
}
public class Enumexample {
	public static void main(String[]args) {
		Color s=Color.RED;
		Color obj= Color.BLUE;
		Color a=Color.GREEN;
		System.out.println(a);
		System.out.println(s);
		System.out.println(obj);
	}

}
