package Collectioninterface;
import java.util.*;
public class Collection2 {
	public static void main(String[]args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Hello");
		list.add("Java");
		list.add("World");
		Iterator<String>itr=list.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}
