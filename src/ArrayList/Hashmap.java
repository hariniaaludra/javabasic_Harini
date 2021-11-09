package ArrayList;
import java.util.*;
public class Hashmap {
	public static void main(String[]args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(110, "Monday");
		map.put(120, "Tuesday");
		map.put(13,"Wednesday");
		map.put(140, "Thrusday");
		map.put(150, "Friday");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
