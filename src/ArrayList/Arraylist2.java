package ArrayList;
import java.util.*;
public class Arraylist2 {
	public static void main(String[]args) {
		ArrayList<Float> list=new ArrayList<Float>();
		list.add(12.5f);
		list.add(14.6f);
		list.add(15.8f);
		list.add(17.4f);
		
		for(Float f:list) {
			System.out.println(f);
		}
		
	}

}
