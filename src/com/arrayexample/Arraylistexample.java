package com.arrayexample; //package name changed
import java.util.*;
public class Arraylistexample {  //class name changed
	public static void main(String[]args) {
		ArrayList<String>list=new ArrayList<>(); //removed string in <>
		list.add("Apple");
		list.add("Mango");
		list.add("Grapes");
		list.add("Banana");
		System.out.println("Fruits:"+list.get(3));
		list.set(2,"Dates");
		for(String str:list) {
			System.out.println(str);
		}
	}

}
