package TestThrow;

public class Test1 {
	public static void main(String[]args) {
		try {
			int data=50/0;
		}catch(ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.out.println("Finally the Exception handled");
		}
	}

}
