package ArrayList;

import java.util.ArrayList;

public class Arraylist3 {
	public static void main(String[]args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Monday");
		list.add("Tuesday");
		list.add("Wednesday");
		list.add("Thursday");
		list.add("Friday");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
