package program2;

public class Breakstatement {
	public static void main(String[]args) {
		/*for(int i =1; i<=10; i++)
		{
			if(i==5) {
			System.out.println(i);
			i++;
			break;
			}
			else {
				System.out.println(i);
			}
		}*/
		
		
		int i=1;
		do {
			if(i==5) {
				i++;
				break;
			}
			System.out.println(i);
			i++;
		}while(i<=10);
		
		}
	}


