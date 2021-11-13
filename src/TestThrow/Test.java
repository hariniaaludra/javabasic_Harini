package TestThrow;
class Parent{
	void method()throws Exception {
		throw new Exception("This is Parent Method");
	}
}
public class Test extends Parent{
	void method()throws Exception{
		System.out.println("This is Child Method");
	}
	public static void main(String[]args){
		Parent p=new Test();
		try {
			p.method();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	 
		
	}
	


