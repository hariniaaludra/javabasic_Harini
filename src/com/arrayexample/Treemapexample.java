package com.arrayexample;
import java.util.*;
public class Treemapexample {
	public static void main(String[]args) {
		TreeMap<Integer,String> map=new TreeMap<>(); //integer and string where removed.
		map.put(101,"Monday");
		map.put(102,"Tuesday");
		map.put(103,"Wednesday");
		map.put(104,"Thursday");
		map.put(105,"Friday");
	
	map.remove(101);
	for(Map.Entry m1:map.entrySet()) {
		System.out.println(m1.getKey()+" "+m1.getValue());
		
	System.out.println("Map:"+map.descendingMap())	;
	
	System.out.println("Map:"+map.headMap(102,true))	;
	
	System.out.println("Map:"+map.tailMap(104,true))	;
	
	System.out.println("Map:"+map.subMap(100,false,102,true))	;
	
	
		
	}

}
	}


