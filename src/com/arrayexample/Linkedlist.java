package com.arrayexample; //package name where changed
import java.util.*;
public class Linkedlist {
	public static void main(String[]args) {
		LinkedList<String> list=new LinkedList<>(); //removed string 
		list.add("Apple");
		list.add("Mango");
		list.add("Orange");
		list.add("Grapes");
		System.out.println("Fruits:"+list.get(1));
		
		list.set(3,"Dates");
		for(String str:list) {
			System.out.println(str);
		}
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
		
		System.out.println(itr.next());
	}

}
}
