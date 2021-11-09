package ArrayList;
import java.util.*;
public class Arraylist1 {
	public static void main(String[]args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("Apple");
		list.add("Mango");
		list.add("Grapes");
		list.add("Banana");
		System.out.println("Fruits:"+list.get(3));
		list.set(2,"Dates");
		for(String str:list) {
			System.out.println(str);
		}
	}

}
