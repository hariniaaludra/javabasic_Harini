package StringBuffer;

public class Stringclass1 {
	public static void main(String[]args) {
		StringBuffer s=new StringBuffer("Hello");
		s.append("World");
		   System.out.println(s);
		s.insert(1,"World");
		   System.out.println(s);
		s.replace(1,3,"World");
		   System.out.println(s);
		s.delete(1,3);
		  System.out.println(s);
		s.reverse();
		  System.out.println(s);
		
		
		
	}

}
