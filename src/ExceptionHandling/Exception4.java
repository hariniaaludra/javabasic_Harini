package ExceptionHandling;

public class Exception4 {
	void student() {
		int data=50/0;
	}
	void subject() {
		 student();
		
	}
	void school() {
		try {
		subject();
		
	}catch(Exception e) {
		System.out.println("Exception Handled");
	}
	}
		public static void main(String[]args) {
			Exception4 obj=new Exception4();
			obj.school();
			System.out.println("the student secured good marks");
		}
	

}
