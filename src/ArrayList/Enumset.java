package ArrayList;
import java.util.*;
 enum days{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class Enumset {
	public static void main(String[]args) {
		EnumSet<days>set=EnumSet.allOf(days.class);
		System.out.println("days:"+set);
		Set<days>set1=EnumSet.noneOf(days.class);
		System.out.println("days:"+set1);
		
		
	}

}
