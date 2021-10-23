package program2;

import java.util.Scanner;

public class Conditionstatement {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Print the number");
				int input=in.nextInt();
				if(input>0) 
				{
					System.out.println("Postive number");
				}
				else if(input<0)
				{
					System.out.println("Negative number");
				}
				else {
					System.out.println("Zero number");
					
					
				}
				
				
	}
}
