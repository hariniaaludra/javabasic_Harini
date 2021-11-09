package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
	public static void main(String[]args) {
		ArrayList<String> Month=new ArrayList<String>();
		Month.add("January");
		Month.add("Febuary");
		Month.add("March");
		Month.add("April");
		
	Iterator<String> obj=Month.iterator();
	
		System.out.println(obj.next());
	}
}
	

	
	


