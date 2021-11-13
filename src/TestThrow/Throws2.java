package TestThrow;

public class Throws2 {
	void maths() throws Exception {
	   throw new Exception("hello thread");
	}
	void social() throws Exception{
	maths();
	}
	void science(){
		try {
		social();
	}catch(Exception e) {
		System.out.println("the exception is handled");
	}
		
	}
	public static void main(String[]args) {
		Throws2 t1=new Throws2();
		
		t1.science();
	}

}
