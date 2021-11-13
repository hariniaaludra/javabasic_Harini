package TestThrow;

public class Throw {
	public static void method(int age) {
		if(age<20) {
			System.out.println("Rejected");
		}
		else {
			System.out.println("Approved");
		}
	}
	public static void main(String[]args) {
		method(22);
		
		
		
	}

}
