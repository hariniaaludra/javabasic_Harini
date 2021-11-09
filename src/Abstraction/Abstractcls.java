package Abstraction;

abstract class Fruit{//Abstract class
	abstract void eat();//Abstract method-does not have a body
}
	
class Apple extends Fruit{
	void eat() {
		System.out.println("Apple is a healthy fruits");
	}

}
	class Orange extends Fruit{
		void eat() {
			System.out.println("Orange is a healthy fruits");
		}
	}
		class Mango extends Fruit{
			void eat() {
				System.out.println("Mango is a healthy fruits");
			}
		}
				
	public class Abstractcls {
		public static void main(String[]args) {
			Fruit s=new Apple();
			s.eat();
			Fruit s1=new Orange();
			s1.eat();
			Fruit s2=new Mango();
			s2.eat();
	
		}
	}

	
	
	


