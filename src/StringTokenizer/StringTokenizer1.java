package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizer1 {
	public static void main(String[]args) {
		StringTokenizer s=new StringTokenizer("My,name,is,Harini");
		System.out.println("Token is:"+s.nextToken(","));
	}

}
