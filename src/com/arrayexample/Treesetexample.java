package com.arrayexample;
import java.util.*;
public class Treesetexample {
	public static void main(String[]args) {
		TreeSet<String> set=new TreeSet<>(); //removed string
		set.add("Jan");
		set.add("Feb");
		set.add("March");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
