package com.arrayexample;//package name changed

import java.util.ArrayList;

public class Arraylistsample {//class name changed
	public static void main(String[]args) {
		ArrayList<String> list=new ArrayList<>();//removed string in <>
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add("Thursday");
		list.add("Friday");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
