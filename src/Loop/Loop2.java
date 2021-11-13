package Loop;
import java.util.*;
import java.io.*;
public class Loop2 {
public static void main(String[]args) {
	Scanner scan=new Scanner(System.in);
	int t=scan.nextInt();
	for(int i=0;i<t;i++) {
		int a=scan.nextInt();
		int b=scan.nextInt();
		int n=scan.nextInt();
		int s=a;
		for(int j=0;j<n;j++) {
			s+=(Math.pow(2, j)*b);
			System.out.printf("%d ", s);
		}
         System.out.println();
	}
}
}
