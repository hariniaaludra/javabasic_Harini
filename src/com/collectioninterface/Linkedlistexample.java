package com.collectioninterface;//pacakage name changed
import java.util.*;
public class Linkedlistexample { //class name changed
	public static void main(String[]args) {
		LinkedList<String> list=new LinkedList<>(); //string where removed
		list.add("Hello");
		list.add("Java");
		list.add("World");
		Iterator<String>itr=list.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}
