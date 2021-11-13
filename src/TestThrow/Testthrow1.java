package TestThrow;

public class Testthrow1 {
	public static void method(int age){
		if(age<23) {
			throw new ArithmeticException("the particular age is rejected");
		}
		
		else{
			System.out.println("the particular age is accepted");
		}
		
	}
	public static void main(String[]args) {
	method(25);
		
	}

}
