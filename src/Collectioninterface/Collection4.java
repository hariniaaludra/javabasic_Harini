package Collectioninterface;
import java.util.*;
public class Collection4 {
	public static void main(String[]args) {
		PriorityQueue<String> queue=new PriorityQueue();
		queue.add("Hello");
		queue.add("Java");
		queue.add("World");
		System.out.println("Queue:"+queue.element());
		System.out.println("Queue:"+queue.peek());
		Iterator<String> itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		Iterator<String>itr1=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
