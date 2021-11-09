package Collectioninterface;
import java.util.*;
public class Collection5 {
	public static void main(String[]args) {
		Deque<String> deque=new ArrayDeque<String>();
		deque.add("Hello");
		deque.add("Java");
		deque.add("World");
		for(String str:deque) {
			System.out.println(str);
		}
	}

}
