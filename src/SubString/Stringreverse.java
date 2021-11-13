package SubString;

import java.util.Scanner;

public class Stringreverse {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		String s=new StringBuffer(a).reverse().toString();
		if(a.equals(s)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
