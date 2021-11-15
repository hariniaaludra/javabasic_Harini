package com.collectioninterface; // package name changed
import java.util.*;
public class Stackexample {//class name changed
	public static void main(String[]args) {
		Stack<String> stack=new Stack<>();// string where removed
		stack.push("Hello");
		stack.push("Java");
		stack.push("World");
		stack.pop();
		Iterator<String>itr=stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
