package ArrayList;
import java.util.*;
public class Treeset {
	public static void main(String[]args) {
		TreeSet<String> set=new TreeSet<String>();
		set.add("Jan");
		set.add("Feb");
		set.add("March");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
