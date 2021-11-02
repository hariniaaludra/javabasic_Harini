package program2;

import java.util.Scanner;

public class Conditionstatement {
	
	Scanner in=new Scanner(System.in);
			
 				int input=in.nextInt();
 			void display()	{
			if(input>=0)
			{
				System.out.println("Postive number");
			}
			else if(input<=0)		{
				System.out.println("Negative number");
			}
			else {
				System.out.println("Zero number");
				
				
			}
 			}
	public static void main(String[]args) {
		
		System.out.println("Print the number");
		
	}
}