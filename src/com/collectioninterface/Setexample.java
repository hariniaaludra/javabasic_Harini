package com.collectioninterface; //package name changed
import java.util.*;
public class Setexample {
	public static void main(String[]args) {
		HashSet<String> set=new HashSet<>();//string where removed
		set.add("Hello");
		set.add("Java");
		set.add("World");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
