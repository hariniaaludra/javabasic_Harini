package ExceptionHandling;

public class Finally {
	public static void main(String[]args) {
		try {
			int data=50/0;
			
		}catch(ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.out.println("finally the block is always excuted");
		}
		System.out.println("rest of the code");
	}

}
