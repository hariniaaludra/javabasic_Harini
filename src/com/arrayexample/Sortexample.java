package com.arrayexample; //package name changed
import java.util.*;
public class Sortexample { //class name changed
	public static void main(String[]args) {
		List<String> list1=new ArrayList<>(); //removed string in <>
		list1.add("Monday");
		list1.add("Tuesday");
		list1.add("Wednesday");
		list1.add("Thrusday");
		list1.add("Friday");
		list1.add("Saturday");
		
		Collections.sort(list1);
		for(String str:list1) {
			System.out.println(str);
		}
		
		
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		
		Collections.sort(list2);
		for(Integer itr:list2) {
			System.out.println(itr);
		}

	}

}
