package Collectioninterface;
import java.util.*;
public class Collection3 {
	public static void main(String[]args) {
		Stack<String> stack=new Stack<String>();
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
