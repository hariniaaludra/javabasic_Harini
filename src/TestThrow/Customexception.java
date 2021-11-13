package TestThrow;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String str) {
		super(str);
	}

public class Customexception {
	static void validate(int age)throws InvalidAgeException {
		if(age<18) {
			System.out.println("age is not valid to vote");
		}
		else {
			System.out.println("Welcome to vote");
		}
		
	}
	public static void main(String[]args) {
		try {
			validate(15);
			
		}catch(InvalidAgeException e) {
			System.out.println("find the Exception");
		
	
		System.out.println("Exception occured:"+e);
		
	}
	}
}
}

