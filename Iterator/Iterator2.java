package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator2 {
	public static void main(String[]args) {
		ArrayList<String> Days=new ArrayList<String>();
		Days.add("Monday");
		Days.add("Tuesday");
		Days.add("Wednesday");
		Days.add("Thursday");
		
		Iterator<String> obj=Days.iterator();
		while(obj.hasNext()) {//while loop
			String i = obj.next();
		      if("Monday" != null) {
		        obj.remove();
		}
		System.out.println(obj.next());
}
	}
}

	



