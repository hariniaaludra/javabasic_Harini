package program2;

public class Continuestatement {
	
	public static void main(String[]args) {
		int i=1;
		
		while(i<=10) {
			if(i==5) {
				i++;
				continue;
				}
			System.out.println(i);
			i++;
			}
		}
	}

/*int i;
	Continuestatement (int i){
		this.i =i;
		while(i<=10) {
			if(i==5) {
				i++;
				continue;
				}
			System.out.println(i);
			i++;
			}
		
	}
	
	public static void main(String[]args) {
		Continuestatement S = new Continuestatement(5);
		System.out.println(S.i);
*/