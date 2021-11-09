package TestThrow;

public class Testthrow {
	public static void method(int age) {
		if(age<22) {
			throw new ArithmeticException("Access denied");
		}
		else {
			System.out.println("Access granted");
		}
	}
		public static void main(String[]args) {
			method(24);
		}
		
	}


