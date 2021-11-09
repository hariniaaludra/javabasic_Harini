package StringBuffer;

public class Stringbuffer {
	public static void main(String[] args) {
		StringBuffer s1 =new StringBuffer("Hello");
		StringBuffer str =new StringBuffer( "World");
		StringBuffer s3=s1.append(str);
		System.out.println(s3);
		StringBuffer s = new StringBuffer("Hello");
	    System.out.println(s.capacity());
		s.append("Harini");
		s.insert(1, "Hello");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		
	}

}
