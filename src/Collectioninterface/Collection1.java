package Collectioninterface;

import java.util.*;

public class Collection1 {
	public static void main(String[]args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Hello");
		list1.add("Java");
		list1.add("World");
		Iterator itr=list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
