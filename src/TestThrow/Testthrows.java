package TestThrow;
class Throws{
	void method()throws Exception{
		throw new Exception("Hello Java World");
		}

}
public class Testthrows {
	public static void main(String[]args) {
		try {
		Throws m=new Throws();
			m.method();
		}catch(Exception e) {
			System.out.println("Hello Java");
		}

}
}
