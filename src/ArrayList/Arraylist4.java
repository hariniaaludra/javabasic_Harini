package ArrayList;
import java.util.*;
public class Arraylist4 {
	public static void main(String[]args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Jan");
		list.add("Feb");
		list.add("March");
		Collections.sort(list);
		for(String i:list) {
			System.out.println(i);
		}
	}

}
