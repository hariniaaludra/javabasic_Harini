package StringBuilder;

public class Stringmethods {
	public static void main(String[]args) {
		String s=" Hello World ";
		String s1="Harini";
		System.out.println(s1.length());
		String replaceString =s.replace("Hello","Helo");
		System.out.println(replaceString);
		System.out.println(s.charAt(6));
		System.out.println(s.startsWith("H"));
		System.out.println(s.endsWith("d"));
		System.out.println(s.trim());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
	}

}
