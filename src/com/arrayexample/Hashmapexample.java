package com.arrayexample;// package name changed
import java.util.*;
public class Hashmapexample { // class name changed
	public static void main(String[]args) {
		HashMap<Integer,String> map=new HashMap<>();//integer and string where removed
		map.put(110, "Monday");
		map.put(120, "Tuesday");
		map.put(13,"Wednesday");
		map.put(140, "Thrusday");
		map.put(150, "Friday");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
