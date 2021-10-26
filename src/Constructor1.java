
public class Constructor1 {
	static void main() {//no arguments will pass default constructor
		String name="Harini";
		int age=22;
		System.out.println(name+" "+age);
	}
	static void method(int a,int b) {//arguments will pass parameterized constructor
		System.out.println(a+b);
	}
	public static void main(String[]args) {
		main();
		method(10,20);
	}

}
