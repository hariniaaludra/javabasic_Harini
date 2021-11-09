package StringBuffer;

public class Stringcompare {
	public static void main(String[]args) {
		String s1="Hello";
		String s2="Hello";
		String s3=new String("World");
		String s4="HELLO";
	String	s=s1.concat(s4);
	System.out.println(s);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
	}

}
