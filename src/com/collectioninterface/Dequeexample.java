package com.collectioninterface;//package name changed
import java.util.*;
public class Dequeexample {//class name changed
	public static void main(String[]args) {
		Deque<String> deque=new ArrayDeque<>(); // string where removed
		deque.add("Hello");
		deque.add("Java");
		deque.add("World");
		for(String str:deque) {
			System.out.println(str);
		}
	}

}
