package com.arrayexample;//package name changed
import java.util.*;
public class Arraylistprogram {
	public static void main(String[]args) {
		ArrayList<Float> list=new ArrayList<>();//remove Float in <>
		list.add(12.5f);
		list.add(14.6f);
		list.add(15.8f);
		list.add(17.4f);
		
		for(Float f:list) {
			System.out.println(f);
		}
		
	}

}
