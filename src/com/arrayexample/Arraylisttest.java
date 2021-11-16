package com.arrayexample; //package name was changed
import java.util.*;
public class Arraylisttest {
	public static void main(String[]args) {
		ArrayList<String> list=new ArrayList<>();// string was removed
		list.add("Jan");
		list.add("Feb");
		list.add("March");
		Collections.sort(list);
		for(String i:list) {
			System.out.println(i);
		}
	}

}
