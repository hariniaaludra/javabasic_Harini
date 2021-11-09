package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerclass {
	public static void main(String[]args) {
		StringTokenizer s=new StringTokenizer ("Hello World");
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
		}
		
	}

}
