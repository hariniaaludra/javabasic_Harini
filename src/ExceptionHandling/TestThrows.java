package ExceptionHandling;

import java.io.IOException;

public class TestThrows {
	 void student()throws IOException {
		throw new IOException("Access denied");
	}
	 void subject()throws IOException{
		student();
	 }
	 void school() {
		 try {
		 subject();
	 }catch (IOException e) {
		 System.out.println("Access granted");
	 }
	 }
		 public static void main(String[]args) {
			 TestThrows obj=new TestThrows();
			 obj.school();
			 System.out.println("Exception Handled");
		 }

}
