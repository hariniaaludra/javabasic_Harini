package StringBuilder;

public class StringBuilder1 {
	public static void main(String[]args) {
		StringBuilder s1=new StringBuilder("Hello");
		s1.append("world");
		   System.out.println(s1);
		s1.insert(1, "World");
		   System.out.println(s1);
		s1.replace(1,3,"World");
		   System.out.println(s1);
		s1.delete(1,3);
		   System.out.println(s1);
	    s1.reverse();
	       System.out.println(s1);
		s1.charAt(3);
		   System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(0,4));
		
		
	}

}
