package ExceptionHandling;

public class Exception2 {
	public static void main(String[]args) {
		try {
			int[]myNumbers= {1,2,3,4,5};
			System.out.println(myNumbers[10]);
		}catch(Exception e) {
			System.out.println("There is no values");
		}
		finally{
			System.out.println("Finished");
			
		}
	}

}
