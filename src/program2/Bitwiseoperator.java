package program2;

public class Bitwiseoperator {
	public static void main(String[]args) {
		int x=10;
		int y=5;
		/*if((x>5 & x++<20)&&(y>10| y--<10)) {
		
			System.out.println("true");
			
			}*/
		System.out.println(x>5 & x++<20);
		System.out.println(y>10 | y--<10);
	}

}
