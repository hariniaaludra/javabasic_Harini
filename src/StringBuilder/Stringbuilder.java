package StringBuilder;

public class Stringbuilder {
	public static void main(String[]args) {
		StringBuilder s1=new StringBuilder("Hello");
		StringBuilder s2=new StringBuilder("Harini");
		StringBuilder s3=s1.append(s2);
		System.out.println(s3.toString());
	
		
	}

}
