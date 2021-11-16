package com.collectioninterface;

import java.util.*;
public class Collectionlistexample {
	public static void main(String[]args) {
		ArrayList<String> list=new ArrayList<>();    //string removed
		list.add("Hello");
		list.add("Java");
		list.add("World");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
