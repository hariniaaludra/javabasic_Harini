package program2;

public class Stringequal {
	public static void main(String[]args) {
		String s1="Hello";
		String s2="World";
		String s3=new String("Hello");
		String s4="World";
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
		System.out.println(s3.equals(s1));
		System.out.println(s4.equals(s2));
		
	}

}
