package Collectioninterface;
import java.util.*;
public class Set {
	public static void main(String[]args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Hello");
		set.add("Java");
		set.add("World");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
